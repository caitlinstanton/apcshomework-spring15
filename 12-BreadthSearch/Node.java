public class Node<E>{
    
    private E symbol;
    private int x;
    private int y;
    private Node<E> next;
    
    public Node(){
        symbol = null;
	next = null;
    }

    public Node(E s) {
	symbol = s;
	next = null;
    }

    public Node(E s, int xcor, int ycor){
	symbol = s;
        x = xcor;
	y = ycor;
	next = null;
    }

    public void setData(int xcor, int ycor){
        x = xcor;
	y = ycor;
    }

    public int getX(){
	return x;
    }

    public int getY() {
	return y;
    }
    
    public E getData() {
	return symbol;
    }

    public void setNext(Node<E> n){
	next = n;
    }

    public Node<E> getNext(){
	return next;
    }

    public String toString(){
	return "[" + x + ", " + y + "]";
    }
}
