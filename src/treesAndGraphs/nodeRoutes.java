package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class nodeRoutes {
	
	enum State {Unvisited, Visiting, Visited};
	
	public boolean hasRoute(graphCreate g2, graphNode src, graphNode dest) {
		if (src.val == dest.val) {
			return true;
		}
		
		Queue<graphNode> q= new LinkedList<>();
		src.state = State.Visiting;
		q.add(src);
		
		while(!q.isEmpty()) {
			graphNode gNode = q.remove();
			ArrayList<graphNode> adjacentNodes = g2.getAdjacent(gNode);
			for (int i=0; i<adjacentNodes.size(); i++) {
				graphNode gNodeTemp = adjacentNodes.get(i);
				if (gNodeTemp.state == State.Unvisited) {
					if (gNodeTemp.val == dest.val){
						return true;
					}else {
						gNodeTemp.state = State.Visiting;
						q.add(gNodeTemp);
					}
				}
			gNode.state = State.Visited;	
			}
		}
		return false;
	}
}
