public class myQueue<E> {

    public Node<E> start;
    public Node<E> end;

    public myQueue(){
	start = null;
	end = null;
    }

    public boolean empty(){
	return start == null;
    }

    public void enqueue(Node<E> n){
	if (start == null) {
	    start = n;
	    end = start;
	} else {
	    Node<E> tmp = n;
	    end.setNext(tmp);
	    end = tmp;
	}
    }

    public Node<E> dequeue (){
        Node<E> tmp = start;
	start = start.getNext();
	return tmp;
    }

    public Node<E> head(){
        return start;
    }

    public String toString() {
	String s = "HEAD <-- ";
	Node<E> tmp = end.getNext();
	while (tmp != null) {
	    s += "[" +  tmp.getX() + ", " + tmp.getY() + "]" +  " <-- ";
	    tmp = tmp.getNext();
	}
	return s + "TAIL";
    }
}
