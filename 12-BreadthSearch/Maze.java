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
	String s = "^[[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	
	return s;
    }
    
    public String solve(int x, int y) {
	int recursion = 0;
        Node n = new Node(board[x][y],x,y);
	q.enqueue(n);
	Node<Character> current;
        while (!q.empty() && solved == false) {
	    recursion++;
	    System.out.println(recursion);
	    current = q.dequeue();
	    board[n.getX()][n.getY()] = me;
	    if (board[n.getX()][n.getY()] == exit) {
		solved = true;
		return "YAAAS";
	    } 
	    if (n.getX()-1 > 0 && n.getX()-1 < maxX &&
		n.getY() > 0 && n.getY() < maxY) {
		board[n.getX()-1][n.getY()] = me;
		Node<Character> up = new Node(board[n.getX()-1][n.getY()],n.getX()-1, n.getY());
		q.enqueue(up);
		System.out.println("UP");
		System.out.println(this);
		try{
		    Thread.sleep(25);
		} catch (Exception e){}
		solve(up.getX(),up.getY());
	    }
	    if (n.getX()+1 > 0 && n.getX()+1 < maxX &&
		n.getY() > 0 && n.getY() < maxY) {
		board[n.getX()+1][n.getY()] = me;
		Node<Character> down = new Node(board[n.getX()+1][n.getY()],n.getX()+1, n.getY());
		q.enqueue(down);
		System.out.println("DOWN");
		System.out.println(this);
		try{
		    Thread.sleep(25);
		} catch (Exception e){}
		solve(down.getX(),down.getY());
	    }
	    if (n.getX() > 0 && n.getX() < maxX &&
		n.getY()-1 > 0 && n.getY()-1 < maxY) {
		board[n.getX()][n.getY()-1] = me;
		Node<Character> left = new Node(board[n.getX()][n.getY()-1],n.getX(), n.getY()-1);
		q.enqueue(left);
		System.out.println("LEFT");
		System.out.println(this);
		try{
		    Thread.sleep(25);
		} catch (Exception e){}
		solve(left.getX(),left.getY());
	    }
	    if (n.getX() > 0 && n.getX() < maxX &&
		n.getY()+1 > 0 && n.getY()+1 < maxY) {
		board[n.getX()][n.getY()+1] = me;
		Node<Character> right = new Node(board[n.getX()][n.getY()+1],n.getX(), n.getY()+1);
		q.enqueue(right);
		System.out.println("RIGHT");
		System.out.println(this);
		try{
		    Thread.sleep(25);
		} catch (Exception e){}
		solve(right.getX(),right.getY());
	    }
	}
	return "NOPE";
	/*
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
	*/

    
    }
}
