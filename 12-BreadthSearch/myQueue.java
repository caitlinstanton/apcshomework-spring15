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

    public void enQueue(int x, int y){
	Node tmp = new Node(x, y);
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

    public String deQueue (){
	Node tmp = end.getNext();
	Node before = end;
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	    before = before.getNext();
	}
	String retval = tmp.getData();
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

    public String head(){
	Node tmp = end.getNext();
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	}
	return (tmp.getData());
    }

    public String toString() {
	String s = "";
	Node tmp = end.getNext();
	while (tmp != null) {
	    s += tmp.getData() + "\n";
	    tmp = tmp.getNext();
	}
	return s;
    }
}
