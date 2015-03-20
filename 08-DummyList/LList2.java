public class LList2<E> implements Iterator<E> {

    private Node<E> l;
    
    public LList2(Node<E> n) {
	l = n;
    }

    public boolean hasNext() {
	return l != null;
    }

    public E next() {
	//Move to next node and return value to 
	//node before the move
        E s = l.getData();
	Node<E> val = l;
	l = l.getNext();
	remove();
	return s;
    }
    
    public void remove() {
	Node<E> tmp = null;
	while (tmp != val) {
	    tmp = tmp.getNext();
	}
	tmp.setNext(l);
    }
}
