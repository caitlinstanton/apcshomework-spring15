/*
BASE CASE: hit a wall
           get to the end

Don't move to the right--recursively call to go to the right
Solve(x,y) -- Solve(x+1,y)

Solve(x,y) {
           Done if B[x][y] = exit
           Return to previous strp if B[x][y] = wall
           Otherwise: Solve(x+1,y)
                      Solve(x-1,y)
                      Solve(x,y+1)
                      Solve(x,y-1)
}
*/



import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private char wall = ' ';
    private char exit = '$';
    private char path = '#';
    private char me = 'C';
    private char visited = '@';

    public Maze() {
    maxX=40;
    maxY=20;
    board = new char[maxX][maxY];
    
    try {
      Scanner sc = new Scanner(new File("maze.dat"));
      int j=0;
      while (sc.hasNext()) {
          String line = sc.nextLine();
          for (int i=0;i<maxX;i++) {
              board[i][j] = line.charAt(i);
          }
          j++;
        }
    }
    catch (Exception e)
	{
	}
    
    }
    
    public String toString() {
	String s = "[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	
	return s;
    }

    public void solve(int x, int y) {
	try {
	    Thread.sleep(100);
	} catch (Exception e) {
	}
	if (board[x][y] == wall || board[x][y] == me || board[x][y] == visited) {
	    return;
	}
	if (board[x][y] == exit) {
	    System.out.println(this);
	    System.exit(0);
	}
	if (board[x][y] != path) {
	    return;
	}
	System.out.println(this);
	board[x][y] = me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y+1);
	solve(x,y-1);
	board[x][y] = visited;
    }
    
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
    }
    
}
