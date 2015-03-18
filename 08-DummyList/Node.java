public class Node {

    private int data;
    private Node next;  //kind of like a recursive data structure

    public Node(int s) {
	data = s;
	next = null;
    }
    
    public void setData(int s) {
	data = s;
    }

    public int getData() {
	return data;
    }

    public void setNext(Node n) {
	next = n;
    }
    
    public Node getNext() {
	return next;
    }

    public String toString() {
	return "" + data;
    }

}
