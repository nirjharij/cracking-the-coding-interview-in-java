package treesAndGraphs;

import treesAndGraphs.nodeRoutes.State;

public class test {
	public static void main(String[] args) {
		int vertices = 5;
		graphCreate g = new graphCreate(vertices);
		
		g.createMapping("A", 0);
		g.createMapping("B", 1);
		g.createMapping("C", 2);
		g.createMapping("D", 3);
		g.createMapping("E", 4);
		
		graphNode gNode1 = new graphNode(State.Unvisited, "A");
		graphNode gNode2 = new graphNode(State.Unvisited, "B");
		graphNode gNode3 = new graphNode(State.Unvisited, "C");
		graphNode gNode4 = new graphNode(State.Unvisited, "D");
		graphNode gNode5 = new graphNode(State.Unvisited, "E");
		
		g.addEdge(gNode1, gNode2);
		g.addEdge(gNode1, gNode3);
		g.addEdge(gNode2, gNode4);
		g.addEdge(gNode3, gNode4);
		g.addEdge(gNode4, gNode5);
		
		graphNode gNodesrc = new graphNode(State.Unvisited, "B");
		graphNode gNodedest = new graphNode(State.Unvisited, "C");
//		g.printGraph();
		nodeRoutes nRoutes = new nodeRoutes();
		System.out.println(nRoutes.hasRoute(g, gNodesrc, gNodedest));		
	}
}
