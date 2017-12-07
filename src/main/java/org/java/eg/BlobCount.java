package org.java.eg;

public class BlobCount {
	private static final int N = 8;
	
	private static int [][] island = { 
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1},
			
	};
	
	private static final int WATER = 0;
	private static final int ISLAND = 1;
	private static final int VISITED = 2;
	
	public static int countIsland(int x, int y) {
		
		if(x<0 || y<0 || x>=N || y>=N) {
			return 0;
		}
		else if(island[x][y] != ISLAND) {
			return 0;
		} else {
			island[x][y] = VISITED;
			
			return 1 + (countIsland(x-1, y-1) +  countIsland(x-1, y) + countIsland(x-1, y+1) +
						countIsland(x, y-1) +  countIsland(x, y+1) +
						countIsland(x+1, y-1) +  countIsland(x+1, y) +  countIsland(x+1, y+1));
		}
	}
	
	public static void main(String[] args) {
		int result = countIsland(3, 5);
		System.out.println(result);
	}
}
