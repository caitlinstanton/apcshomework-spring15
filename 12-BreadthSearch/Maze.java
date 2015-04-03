import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private int tmpX = 0;
    private int tmpY = 0;
    private char wall = ' ';
    private char exit = '$';
    public myQueue q = new myQueue();
    private char path = '#';
    private char me = 'C';
    private char visited = '.';
    private boolean solved = false;
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
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
    
    public void solve(Node tmp) {
	tmpX = tmp.getX();
	tmpY = tmp.getY();
	board[tmpX][tmpY] = me;
	while (solved == false) {
	    q.enqueue(tmp.getX(),tmp.getY());
	    if (board[tmpX][tmpY] == exit) {
		solved = true;
		System.exit(0);
	    }
	    board[tmpX][tmpY] = visited;
	    q.dequeue();  
	    solveHelper();
	}
    }
    
    public void solveHelper() {
	if (tmpX + 1 < maxX) {
	    if (board[tmpX+1][tmpY] != wall &&
		board[tmpX+1][tmpY] != exit) {
		Node tmp1 = new Node(tmpX+1, tmpY);
		q.enqueue(tmp1.getX(), tmp1.getY());
		solve(tmp1);
	    }
	}
	if (tmpX - 1 > 0) {
	    if (board[tmpX-1][tmpY] != wall &&
		board[tmpX+1][tmpY] != exit) {
		Node tmp2 = new Node(tmpX-1, tmpY);
		q.enqueue(tmp2.getX(), tmp2.getY());
		solve(tmp2);
	    }
	}
	if (tmpY + 1 < maxY) {
	    if (board[tmpX][tmpY+1] != wall &&
		board[tmpX+1][tmpY] != exit) {
		Node tmp3 = new Node(tmpX, tmpY+1);
		q.enqueue(tmp3.getX(), tmp3.getY());
		solve(tmp3);
	    }
	}
	if(tmpY - 1 > 0) {
	    if (board[tmpX][tmpY-1] != wall &&
		board[tmpX+1][tmpY] != exit) {
		Node tmp4 = new Node(tmpX, tmpY-1);
		q.enqueue(tmp4.getX(), tmp4.getY());
		solve(tmp4);
	    }
	}
	
    }
    
    public static void main(String[] args){
	Node n = new Node(0,0);
	Maze m = new Maze();
	System.out.println(m);
	m.solve(n);
    }
    
}
