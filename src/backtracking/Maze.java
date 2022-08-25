package backtracking;

import java.util.ArrayList;
import java.util.List;import javax.swing.RowFilter;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(maze(3, 4));
//		printMaze("", 3, 3);
//		System.out.println();
//		for(String s:listMaze("", 3, 3))
//		System.out.println(s);
		boolean [][] maze = {
				{true,true,true},
				{true,false,true},
				{true,true,true}
				};
		mazeWithRestrictions("", 0, 0, maze);
		

	}
	
	static int maze(int row, int col) {
		if(row==1 || col ==1 ) {
			return 1;
		}
		int left = maze(row-1, col);
		int right = maze(row, col-1);
		return left + right;
	}
	static void printMaze(String path,int row, int col) {
		if(row ==1 && col ==1) {
			System.out.println(path);
			return;
		}
		if(row >1 ) {
			printMaze(path + "down  ", row-1, col);
		}
		if(col>1) {
			printMaze(path+"right  ", row, col-1);
		}
	}
	
	static List<String> listMaze(String path,int row, int col){
		if(row ==1 && col ==1) {
			List<String> list = new ArrayList<>();
			list.add(path);
			return list;
		} 
		List<String> list = new ArrayList<>();
		if(row >1) 
			list.addAll(listMaze(path+"down ", row-1, col));
		if(col >1) 
			list.addAll(listMaze(path+"right ", row, col-1));
		if(row >1 && col>1)
			list.addAll(listMaze(path+"diagonal ",row-1,col-1));
		
		return list;
	}	
	static void mazeWithRestrictions(String path, int row,int col,boolean [][] maze) {
		if(row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(path);
			return;
		}
		if(!maze[row][col])
			return;
		
		if(row < maze.length-1) {
			mazeWithRestrictions(path + "down ", row+1, col, maze);
		}
		if(col < maze[0].length-1) {
			mazeWithRestrictions(path + "right ", row, col+1, maze);
		}
	}
}
