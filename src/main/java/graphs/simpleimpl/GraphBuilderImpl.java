/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.simpleimpl;

import graphs.BuildNode;
import graphs.Graph;
import graphs.GraphBuilder;
import graphs.Node;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tobias
 */
public class GraphBuilderImpl implements GraphBuilder {
	private final List<Node> nodes;

	public GraphBuilderImpl() {
		nodes = new ArrayList();
	}

	public BuildNode createNode(String name) {
		NodeImpl res = new NodeImpl(name);
		nodes.add(res);
		return res;
	}

	public void createEdge(BuildNode begin, BuildNode end) {
		if (begin instanceof NodeImpl && end instanceof NodeImpl) {
			NodeImpl beginImpl = (NodeImpl) begin;
			NodeImpl endImpl = (NodeImpl) end;
			beginImpl.addEdgeTo(endImpl);
		} else {
			throw new RuntimeException("The nodes must be created with the same GraphBuilder!!!");
		}
	}

	public Graph build() {
		return new GraphImpl(nodes);
	}

}
