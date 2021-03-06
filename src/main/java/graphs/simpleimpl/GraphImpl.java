/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.simpleimpl;

import graphs.Graph;
import graphs.Node;

/**
 *
 * @author Tobias
 */
public class GraphImpl implements Graph {
	private final Iterable<Node> nodes;

	public GraphImpl(Iterable<Node> nodes) {
		this.nodes = nodes;
	}

	public Iterable<Node> getNodes() {
		return nodes;
	}

	public Node findNode(String name) {
		for (Node n : nodes) {
			if (name.equals(n.getName())) {
				return n;
			}
		}
		return null;
	}

	public int size() {
		int counter = 0;
		for (Node node : nodes) {
			counter++;
		}
		return counter;
	}

}
