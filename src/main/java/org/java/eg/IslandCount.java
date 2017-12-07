package org.java.eg;

public class IslandCount {
	
	private static final char WATER = '0';
	
	private static final char ISLAND = 'x';
	
	private static final char VISITED = '1';
	
//	private static char [][] island = { 
//			//j=0, 1, 2
//			{'0', 'x', 'x'}, //i=0
//			{'0', '0', 'x'}, // 1
//			{'0', 'x', '0'}, // 2
//	};
	
	private static char [][] island = { 
	//j=0, 1, 2
	{'0', '0', 'x', 'x', 'x', '0', '0', 'x', 'x'}, //i=0
	{'0', '0', 'x', '0', '0', '0', '0', 'x', '0'} // 1
	};
	
	private static int NROW = island.length;
	
	private static int NCOL = island[0].length;

	
	public static boolean getNumberIsland(int x, int y) {
		if(x<0 || y<0 || x>=NROW || y>=NCOL) {
			return false;
		} else if(island[x][y]!=ISLAND) {
			return false;
		} else {
			island[x][y] = VISITED;
			if(getNumberIsland(x, y-1) ||  getNumberIsland(x-1, y) || getNumberIsland(x, y+1) || getNumberIsland(x+1, y)) {
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		int count = 0;
		for(int i=0; i<NROW; i++) {
			for(int j=0; j<NCOL; j++) {
				if(island[i][j]==ISLAND) {
					count++;
				}
				if(getNumberIsland(i, j))
					count++;
			}
		}
		System.out.println(count);
		printIsland();
	}
	
	public static void printIsland() {
		for(int i=0; i<NROW; i++) {
			for(int j=0; j<NCOL; j++) {
				System.out.print(island[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
}
