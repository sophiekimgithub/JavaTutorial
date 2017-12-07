package org.java.eg;

import java.util.Stack;

public class MazeTest {
	
	private static int N = 8;
	private static int [][] maze = { //0:path, 1:wall
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0},
	};
	private static final int PATHWAY = 0 ;
	private static final int WALL = 1;
	private static final int BLOCKED = 2;
	private static final int PATH = 3;
	
	public static boolean findMazePath(int x, int y) {
	
		if(x<0 || y<0 || x>=N || y>=N) {
			return false;
		}
		else if(maze[x][y]!=PATHWAY) {
			return false;
		}
		else if(x==N-1 && y==N-1) {
			maze[x][y] = PATH;
			return true;
		}
		else {
			maze[x][y] = PATH;
			if(findMazePath(x-1, y) || findMazePath(x, y+1) || findMazePath(x+1, y) || findMazePath(x, y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED;
			return false;
		}
	} 
	public static void printMaze() {
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(maze[j][i]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		findMazePath(0, 0);
		printMaze();
	}

}
