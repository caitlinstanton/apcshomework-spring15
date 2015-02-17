 
import java.io.*;
import java.util.*;

public class main {
    private int[][] board;
    private int height;
    private int width;
    private Scanner scan;

    private static int numTries = 0; //keeps track of how many total recursions it took to solve
    private boolean solved = false;

    public main(){
	//set height and width of board
	scan = new Scanner(System.in);
	System.out.print("Height:");
	height = Integer.parseInt(scan.nextLine());
	System.out.print("Width:");
	width = Integer.parseInt(scan.nextLine());
	System.out.println(height + " X " + width + ":");

	//allow for -1 buffers
	int maxY = height + 4;
	int maxX = width +4;
	board = new int[maxY][maxX];
	for(int y = 0; y < maxY;y++){
	    if(y <2 || y >= maxY -2){
		for(int x = 0; x <maxX;x++){
		    board[y][x] = -1;
		}
	    } else {
		board[y][0] = -1;
		board[y][1] = -1;
		board[y][maxX-2] = -1;
		board[y][maxX-1] = -1;
	    }
	}
    }

    public void print(){
	for(int y=0; y < board.length;y++){
	    for(int x=0; x < board[0].length;x++){
		if(board[y][x] != -1){
		    System.out.printf("|%2d",board[y][x]);		
		    if(x == width +1){
			System.out.printf("|");
		    }
		}
	    }
	    System.out.printf("\n");
	}
    }
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
	
    public void solve(int x, int y,int numMoves){
	if(board[y][x] != 0 || solved){
	    return;
	}

	board[y][x] = numMoves;
	numTries +=1;
	//delay(100);
	//print();

	if(numMoves == height * width){
	    print();
	    solved = true;
	}

	solve(x+1,y+2,numMoves+1);
	solve(x-1,y+2,numMoves+1);
	solve(x+1,y-2,numMoves+1);
	solve(x-1,y-2,numMoves+1);
	solve(x+2,y+1,numMoves+1);	
	solve(x-2,y+1,numMoves+1);
	solve(x+2,y-1,numMoves+1);
	solve(x-2,y-1,numMoves+1);
	
	if(!solved){
	    numMoves -=1;
	    board[y][x] = 0;
	}
    }

    public static void main(String[] args){
	KnightsTour kt = new KnightsTour();
	kt.solve(2,2,1); //2 because of -1 buffers
	System.out.println("Iterated " + numTries + " times");
    }
}
