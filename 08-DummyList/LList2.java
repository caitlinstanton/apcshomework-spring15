public class LList2<E> {

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
	l = l.getNext();
	return s;
    }
    
}
