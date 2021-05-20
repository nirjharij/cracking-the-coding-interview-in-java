package treesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class buildOrder {
	public static ArrayList<String> orderBuild(HashMap<String, ArrayList<String>> graph) {
		ArrayList<String> output = new ArrayList<String>();
		
		HashMap<String, Integer> state = new HashMap<String, Integer>();
		
		for (String project: graph.keySet()) 
			state.put(project, 0);
		
		
		for (String project : graph.keySet()) {
            System.out.println("Project: " + project);
			if (state.get(project) == 0) {
				if (!dfs(graph, project, state, output)) {
					return null;
				}
			}
		}
		System.out.println(output);
		return output;
	}
	
	public static boolean dfs(HashMap<String, ArrayList<String>> graph, 
			String project, HashMap<String, Integer> state, 
			ArrayList<String> output) {
		
		if (state.get(project) == 1) {
			return false;
		}
		
		if (state.get(project) == 0) {
			state.put(project, 1);
			for (String dependency: graph.get(project)) {
				if (!dfs(graph, dependency, state, output))
					return false;
			}
			state.put(project, 2);
			output.add(project);
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] projects = {"a","b","c","d","e","f"};
		
		String[][] dependencies = {{"a","d"}, {"f","b"}, {"b","d"}, {"f","a"}, {"d","c"}};
		
		HashMap<String, ArrayList<String>> graph = Graph.createGraph(projects, dependencies);
		orderBuild(graph);
	}
}
