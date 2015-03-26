public class myQueue<E> {

    public Node<E> start;
    public Node<E> end;

    public myQueue(){
	start = new Node<E>();
	end = new Node<E>();
	end.setNext(start);
    }

    public boolean empty(){
	return (end.getNext() == start);
    }

    public void enQueue(E e){
	Node<E> tmp = new Node<E>(e);
	tmp.setNext(end.getNext());
	end.setNext(tmp);
    }

    public E deQueue (){
	Node<E> tmp = end.getNext();
	Node<E> before = end;
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	    before = before.getNext();
	}
	E retval = tmp.getData();
	before.setNext(start);
	return retval;
    }

    public E head(){
	Node<E> tmp = end.getNext();
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	}
	return (tmp.getData());
    }

    public String toString() {
	String s = "";
	Node<E> tmp = end.getNext();
	while (tmp != null) {
	    s += tmp.getData() + "\n";
	    tmp = tmp.getNext();
	}
	return s;
    }
}
