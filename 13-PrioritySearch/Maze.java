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
    private char visited = '.';
    private boolean solved = false;

    private LinkedList<Node> l;

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

    public Node findExit() {
	for (int y = 0; y < maxY; y++) {
	    for (int x = 0; x < maxX; x++) {
		if (board[x][y] == exit) {
		    return (new Node(x,y));
		}
	    }
	}
	return null;
    }

    public void addOrder(Node n, LinkedList<Node> list) {
	Node exit = findExit();
	double priority = n.calcEucl(exit.getX(), exit.getY());
	for (int i = 0; i < list.size(); i ++) {
	    if (priority < list.get(i).calcEucl(exit.getX(),exit.getY())) {
		list.add(n,i);
	    }
	}
    }

    public void bestSearch(int x, int y) {
        l = new LinkedList<Node>();
	Node n = new Node(x,y);
	l.addOrder(n,l);
    }
    
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	//m.solve(1,1);
	//m.bfs(1,1);
        //Node n = m.findExit();
	//System.out.println(n.getX());
	//System.out.println(n.getY());
	//System.out.println(n.calcEucl(n.getX(),n.getY()));
	m.bestSearch(1,1);
	
    }
    
}
