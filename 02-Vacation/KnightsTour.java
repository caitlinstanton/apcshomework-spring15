import java.io.*;
import java.util.*;

public class KnightsTour {

    private int dimension;
    private int[][] board;
    private Scanner sc;
    private boolean solved = false; 
   
    public KnightsTour() {
	sc = new Scanner(System.in);
        System.out.print("What do you want the dimensions to be? ");
	dimension = Integer.parseInt(sc.nextLine());

	int maxX = dimension + 4;
	int maxY = dimension +4;
	board = new int[maxX][maxY];
	for (int y = 0; y < maxY; y++) {
	    if (y < 2 || y >= maxY - 2) {
		for (int x = 0; x < maxX; x++) {
		    board[y][x] = -1;
		}
	    } else {
		board[y][0] = -1;
		board[y][1] = -1;
		board[y][maxX - 2] = -1;
		board[y][maxX - 1] = -1;
	    }
	}
    }

    public void printSolution() {
	for (int y = 0; y < board.length; y++){
	    for (int x = 0; x < board[0].length; x++) {
		if (board[y][x] != -1) {
		    System.out.printf("|%2d", board[y][x]);
		    if (x == dimension + 1) {
			System.out.printf("|");
		    }
		}
	    }
	    System.out.printf("\n");
	}
    }
    
    public void solve(int x, int y, int moves) {
        if (board[y][x] != 0 || solved) {
	    return;
	}
	board[y][x] = moves;
	if (moves == (dimension * dimension)) {
	    printSolution();
	    solved = true;
	}
	solve(x+1, y+2, moves+1);
	solve(x-1, y+2, moves+1);
	solve(x+1, y-2, moves+1);	
	solve(x-1, y-2, moves+1);
	solve(x+2, y+1, moves+1);
	solve(x-2, y+1, moves+1);
	solve(x+2, y-1, moves+1);
	solve(x-2, y-1, moves+1);
	if (!solved) {
	    moves = moves - 1;
	    board[y][x] = 0;
	}
    }


    public static void main(String[] args){
	KnightsTour k = new KnightsTour();
	k.solve(2,2,1);
    }
    
}
