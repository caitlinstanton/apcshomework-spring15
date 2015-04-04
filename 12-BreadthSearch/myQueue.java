public class myQueue {

    public Node start;
    public Node end;

    public myQueue(){
	start = new Node();
	end = new Node();
	end.setNext(start);
	//start.setNext(end);
    }

    public boolean empty(){
	return (end.getNext() == start);
	//return start == null;
    }

    public void enqueue(Node n){
	Node tmp = n;
	tmp.setNext(end.getNext());
	end.setNext(tmp);
	/*
	Node<E> tmp = new Node<E>(e);
	if (start == null) {
	    start = tmp;
	    end = tmp;
	} else {
	    end.setNext(tmp);
	    end = tmp;
        }
	 */
    }

    public String dequeue (){
	Node tmp = end.getNext();
	Node before = end;
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	    before = before.getNext();
	}
	String retval = "[" + tmp.getX() + ", " + tmp.getY() + "]";;
	before.setNext(start);
	return retval;
	/*
	if (empty()) {
	   throw EXCEPTION;
        }
	E retval = start.getData();
	start = start.getNext();
	return retval;
	*/	   
    }

    public Node head(){
	Node tmp = end.getNext();
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public String toString() {
	String s = "";
	Node tmp = end.getNext();
	while (tmp != null) {
	    s += "[" +  tmp.getX() + ", " + tmp.getY() + "]" +  "\n";
	    tmp = tmp.getNext();
	}
	return s;
    }
}
