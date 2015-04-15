import java.util.*;
import java.io.*;

public class Node {

    private int x,y;
    private Node prev;
    private double priority;

    public Node(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public Node getPrev() {
	return prev;
    }
    
    public void setPrev(Node n) {
	prev = n;
    }

    public double calcEucl(int exitX, int exitY) {
	int squaredX = (x - exitX) * (x- exitX);
	int squaredY = (y - exitY) * (y - exitY);
	priority = Math.sqrt(squaredX + squaredY);
	return priority;
    }

    public double calcManhattanX(int exitX) {
	if (exitX > x) {
	    return exitX - x;
	} else {
	    return x - exitX;
	}
    }

    public double calcManhattanY(int exitY) {
	if (exitY > y) {
	    return exitY - y;
	} else {
	    return y - exitY;
	}
    }
}
