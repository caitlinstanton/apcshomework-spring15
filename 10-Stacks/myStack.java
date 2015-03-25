public class myStack<E> {

    public Node<E> l;
    
    public myStack() {
        l = null;
    }

    public void push(E data) {
	Node<E> tmp = new Node<E>(data);
        tmp.setNext(l);
	l = tmp;
    }

    public E pop() {
	E tmp = l.getData();
	l = l.getNext();
	return tmp;
    }

     public boolean empty() {
        return l == null;
     }

     public E peek() {
	 if (!empty()) {
	     return l.getData();
	 }
	 return null;
     }

    public String toString() {
	String s = "TOP";
	Node tmp;
	for (tmp = l; tmp != null; tmp = tmp.getNext()){
	    s = s + " <-- " + tmp;
	}
	return s;
    }

}
