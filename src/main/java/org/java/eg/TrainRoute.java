package org.java.eg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TrainRoute {
	
	static int inf = 99999; 
	static int nodeCnt = 5;
	static String[] nodeStrArry = {"A", "B", "C", "D", "E"};
	static String[] edgeStrArry = {"AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7"};
	private Map<String, List<String>> neighborList;
	
	public static void main(String[] args) {
		
        int[][] inputGraph = {          	//  0(A)	1(B)	2(C)	3(D)	4(E)    
						        /* 0(A) */ {   	0,   	5, 		inf, 	5,   	7},
						        /* 1(B) */ {   	0,   	0,   	4,  	inf,   	inf},
						        /* 2(C) */ { 	inf,   	inf,   	0,   	8, 		2},
						        /* 3(D) */ { 	inf,  	inf,   	8,   	0,  	6},
						        /* 4(E) */ {   	inf,   	3, 		inf,  	inf,   	0},
						    };
        

        // Test 1. The distance of the route A-B-C.
        getDistance(edgeStrArry, "ABC");
        // Test 2. The distance of the route A-D.
        getDistance(edgeStrArry, "AD");
        //Test 3. The distance of the route A-D-C.
        getDistance(edgeStrArry, "ADC");
        // Test 4. The distance of the route A-E-B-C-D.
        getDistance(edgeStrArry, "AEBCD");
        // Test 5. The distance of the route A-E-D.
        getDistance(edgeStrArry, "AED");
        // Test 8. The length of the shortest route (in terms of distance to travel from A to C.
        getShortestPath(inputGraph, 0, 2);
        
    }
	
	public TrainRoute(String [] nodeStrArry)  {
		neighborList = new HashMap<String, List<String>>();
	    for(String s:nodeStrArry) 
	    	neighborList.put(s,  new LinkedList<String>()); 
	}
	
	public void setEdge(String toStr, String fromStr) {
		List<String> strList = neighborList.get(toStr);
		strList.add(fromStr);
	}
	
	public List<String> getEdge(String toStr) {
		return neighborList.get(toStr);
	} 
	
	/*
	 * Get distance depending on the number of stops
	 */
	public static void getDistanceDependOnStop(String[] edgeStrArry, int maxStop) {	
		int stopNum = 0;
		TrainRoute glist = new TrainRoute(nodeStrArry);
		for(String str:edgeStrArry) {
			glist.setEdge(str.substring(0, 1), str.substring(1, 2));
		}
		
		for (String str:nodeStrArry) {
			System.out.print(str + " -> ");
            List<String> edgeList = glist.getEdge(str);
            for (int j = 1;; j++) {
            	if (j != edgeList.size())
                     System.out.print(edgeList.get(j - 1) + " -> ");
                 else {
                	 System.out.print(edgeList.get(j - 1));
                     break;
                 }
            }
            System.out.println();
         }
	}

	
	/*
	 * Get distance through given routes
	 */
	public static void getDistance(String[] inputStrArry, String inputNodeStr) {
		String keyStr = "";
		boolean hasRoute = true;
		int distanceSum = 0;
		int strlen = 0;
		Map<String, Integer> inputMap = new HashMap<String, Integer>();
		for(String str:inputStrArry) {
			inputMap.put(str.substring(0, 2), Integer.parseInt(str.substring(2, 3)));
		}
		if(inputNodeStr!=null && !inputNodeStr.isEmpty()) {
			strlen = inputNodeStr.length();
		}
		
		for(int i=0; i<strlen-1; i++) {
			keyStr = String.valueOf(inputNodeStr.charAt(i)).concat(String.valueOf(inputNodeStr.charAt(i+1)));
			if(!inputMap.containsKey(keyStr)) {
				hasRoute = false;
				break;
			}
			distanceSum = distanceSum + (int)inputMap.get(keyStr);
		}
		
		if(hasRoute) 
			System.out.println(distanceSum);
		else
			System.out.println("NO SUCH ROUTE");
		
    }
	
	
	/*
	 * Get the shortest path from start and end node
	 */
    public static void getShortestPath(int[][] graph, int startNode, int endNode) {
        int nodeCount = graph[0].length; 				// total count of node
        boolean[] isVisits = new boolean[nodeCount]; 	// visited node
        int[] distance = new int[nodeCount]; 			// array for distance
        int[] historyPath = new int[nodeCount]; 		// array for history of path
        int nextNode = startNode; 						// start with startNode
        
        int subDistanceSum = 0;
        Stack<Integer> targetPath = new Stack<Integer>();
        targetPath.push(2);
        targetPath.push(3);
        targetPath.push(0);
        
        int min = 0;									// shortest distance
        for (int i = 0; i < nodeCount; i++) {			// initialization
            isVisits[i] = false; 						
            distance[i] = inf; 
            historyPath[i] = inf;
        }
        distance[startNode] = 0; 						
      
        while (true) {		
            min = inf; 
            for (int j = 0; j < nodeCount; j++) {
                if (isVisits[j] == false && distance[j] < min) { 	
                    nextNode = j; 
                    min = distance[j]; 
                }
            }
            if (min == inf)								
                break; 
            
            isVisits[nextNode] = true;  
            for (int j = 0; j < nodeCount; j++) {								// checking row
                int nodeDistance = distance[nextNode] + graph[nextNode][j]; 
                if (distance[j] > nodeDistance) {
                    distance[j] = nodeDistance; 
                    historyPath[j] = nextNode; 
                }
            }
        }
        System.out.print(distance[endNode]); 
    }
     
}
