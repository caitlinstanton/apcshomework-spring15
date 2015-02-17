import java.io.*;
import java.util.*;

public class KnightsTour {
    private int[][] board;
    private int numX;
    private int numY;
    private int space = 0;
    private int moves = 0;
    private boolean solved = false;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public KnightsTour(int n) {
	int numX = n;
	int numY = n;
	board = new int[numX][numY];
	for (int i = 0; i < numX; i++) {
	    for (int j = 0; j < numY; j++) {
		board[i][j] = space;
	    }
	}
	
    }
    
    public String toString() {
	String s = "[2J\n";
	for (int y=0;y<numY;y++){
	    for (int x=0;x<numX;x++){
		s = s + board[x][y];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public void solve(int x, int y) {
	if (board[x][y] != space || solved) {
	    moves = moves - 1;
	    return;
	}
	if (moves == 25) {
	    System.out.println(this);
	    solved = true;
	    System.out.println("YESH");
	}
	delay(100);
	System.out.println(this);
	//board[x][y] = me;
	try {
	    solve(x+2,y+1);
	    solve(x+2,y-1);
	    solve(x-2,y+1);
	    solve(x-2,y-1);
	    solve(x+1,y+2);
	    solve(x-1,y+2);
	    solve(x+1,y-2);
	    solve(x-1,y-2);
	} catch (Exception e) {}
	if (!solved) {
	    board[x][y] = moves;
	}
	moves = moves + 1;
    }
    
    public static void main(String[] args){
	KnightsTour k = new KnightsTour(5);
	System.out.println(k);
	k.solve(1,1);
    }
    
}
