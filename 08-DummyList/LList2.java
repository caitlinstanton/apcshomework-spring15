public class LList2 {

    private Node l;
    
    public LList2(Node n) {
	l = n.getNext();
    }

    public boolean hasNext() {
	return l != null;
    }

    public int next() {
	//Move to next node and return value to 
	//node before the move
	int s = l.getData();
	l = l.getNext();
	return s;
    }
    
}
