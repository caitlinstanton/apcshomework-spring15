public class LList<E> {
    
    private Node<E> start,end;
    private int len;
    
    public LList2 getLList2() {
	LList2<E> llist2 = new LList2<E>(start);
	return llist2;
    }

    public void add(E s){
	Node<E> tmp = new Node<E>(s);
        start.setNext(tmp);
	tmp.setNext(end);
	end = tmp;
	/*
	  tmp.setNext(start.getNext());
	  start.setNext(tmp);
	*/
	len++;
    }


    public void add(E n, E s) {
	Node<E> added = new Node<E>(s);
	Node<E> before = start;
	for (int i = 0; i < n; i++) {
	    before = before.getNext();
	}
	added.setNext(before.getNext());
	before.setNext(added);
	len++;
    }

    public E get(E n) {
	if (n >= len || n < 0) {
	    throw new IndexOutOfBoundsException();
	} else {
	    Node<E> tmp = start;
	    int counter = -1;
	    while(counter < n && counter < len) {
		tmp = tmp.getNext();
		counter++;
	    }
	    return tmp.getData();
	}
    }

    /*
    public void remove(int n) {
	Node before = get(n - 1);
	Node after = get(n + 1);
	before.setNext(after);
	len--;
    }
    INCORRECT BECAUSE GET IS MEANT TO RETURN DATA, NOT A NODE
    */

    public boolean remove(E n) {
	/*
	Node tmp = start;
	for (int i = 0; i < len; i++) {
	    if(tmp.getNext().getData() == n) {
		tmp.setNext(tmp.getNext().getNext());
		len--;
		return true;		   
	    }
	    tmp = tmp.getNext();
	}
        return false;
	*/
	Node<E> tmp = start.getNext();
	Node<E> t2 = tmp;
	while (tmp != null) {
	    if (tmp.getData() == n) {
		t2.setNext(tmp.getNext());
		len--;
		return true;
	    }
	    t2 = tmp;
	    tmp = tmp.getNext();
	}
	return false;
    }
    
    public int size() {
	return len;
    }
    
    public String toString(){
	String s = "empty --> ";
	Node<E> tmp;
	for (tmp = start.getNext(); tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
}
