public class LList {

    private Node l = null;

    public void add(String s) {
	l = new Node(s);
	l.setNext(null);
    }

    public String toString() {
	String s = "";
	Node temp;
	for (temp = l; temp != null; temp = temp.getNext()) {
	    s = s + temp + "-->";
	}
	s = s + null;
	return s;
    }

}
