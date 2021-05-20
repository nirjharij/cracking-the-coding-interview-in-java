package treesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	private static HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	
	public static HashMap<String, ArrayList<String>> createGraph(String[] projects, String[][] dependencies) {
		for (String project : projects) {
			map.put(project, new ArrayList<String>());
		}
		
		for (String[] dependency: dependencies) {
			String first = dependency[0];
			String second = dependency[1];
			ArrayList<String> arrayList = map.get(second);
			arrayList.add(first);
			map.put(second, arrayList);
		}
		System.out.println(map);
		return map;
	}
	
	
}
