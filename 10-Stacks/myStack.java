public class myStack<E> {

    public Node<E> start,end,pointer;
    
    public myStack() {
	start = new Node("");
	end = null;
	pointer = start;
    }

    public void push(E data) {
	Node<E> tmp = new Node<E>(data);
	start.setNext(tmp);
	tmp.setNext(end);
	start = tmp;
    }

    //    public E pop() {
    //
    // }

     public boolean empty() {
        return pointer.getNext() == null;
     }

     public E top() {
	 return start.getNext().getData();
     }

    public String toString() {
	String s = "bottom";
	Node tmp;
	System.out.println("END: "+end);
	for (tmp = pointer; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "top";
	return s;
    }

}
