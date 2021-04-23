package treesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class graphCreate {
	private ArrayList<ArrayList<graphNode>> graph;
	
	HashMap<String, Integer> mapping = new HashMap<String, Integer>();
	
	public void createMapping(String val, int index) {
		mapping.put(val, index);
	}
	
	public graphCreate(int vertices) {
		this.graph= new ArrayList<ArrayList<graphNode>>(vertices);
		
		for (int i = 0; i < vertices; i++)
            this.graph.add(new ArrayList<graphNode>());
	}
	
	public void addEdge(graphNode src, graphNode dest) {
		int src_index = mapping.get(src.val);
		graph.get(src_index).add(dest);
	}
	
	public ArrayList<graphNode> getAdjacent(graphNode src) {
		int src_index = mapping.get(src.val);
		return graph.get(src_index);
	}
	
	public void printGraph()
    {
        for (int i = 0; i < graph.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(" -> "+ graph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
