package backtracking;

import java.util.Arrays;

public class AllPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] maze = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
				};
		int [][] path = new int[maze.length][maze[0].length];
		printAllPaths("", 0, 0, path, maze, 1);

	}
	static void printAllPaths(String p,int row,int col,int[][]path, boolean[][]maze,int step) {
		if(row == maze.length-1 && col == maze[0].length-1) {
			//this here is also a step.
			path[row][col] = step;
			for(int []arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
			return;
		}
		if(!maze[row][col])
			return;
		
		// I am considering this block in my path
		maze[row][col] = false;
		//we are sort of building/marking our path to the last cell, based on the number of steps so far
		//means which cell is which step
		path[row][col] = step;
		if(row < maze.length-1) {
			printAllPaths(p+"down ", row+1, col, path, maze, step+1);
		}
		if(col < maze[0].length-1) {
			printAllPaths(p+"right ", row, col+1, path, maze, step+1);
		}
		if(row >0) {
			printAllPaths(p+"up ", row-1, col, path, maze, step+1);
		}
		if(col >0) {
			printAllPaths(p+"left ", row, col-1, path, maze, step+1);
		}
		maze[row][col] = true;
		//this is to restore all the steps traced on the current path array by the current recusrive calls !
		path[row][col] = 0;
	}
	
	static void allPaths(String path,int row,int col,boolean[][]maze) {
		if(row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(path);
			return;
		}
		if(!maze[row][col])
			return;
		
		// I am considering this block in my path
		maze[row][col] = false;
		if(row < maze.length-1) {
			allPaths(path+"down ", row+1, col, maze);
		}
		if(col < maze[0].length-1) {
			allPaths(path+"right ", row, col+1, maze);
		}
		if(row >0) {
			allPaths(path+"up ", row-1, col, maze);
		}
		if(col >0) {
			allPaths(path+"left ", row, col-1, maze);
		}	
		//this is where the function ends
	//Since we are exiting this function let's restore the changes we made via this recursive call
		maze[row][col] = true;
	}}
