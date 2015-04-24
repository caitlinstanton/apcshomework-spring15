public class BST {

    private Node r;
    
    public BST() {
	r = new Node();
    }

    public BST(Node n) {
	r = n;
    }
    
    public Node search(Node T, Integer i) {
	while (T != null) {
	    int c = T.getData().compareTo(i);
	    if (c > 0) {
		T = T.getRight();
	    } else if (c < 0) {
		T = T.getLeft();
	    } else {
		return T;
	    }
	}
	return null;
    }

    public void insert(Node t, Integer i) {
	Node t = r;
	Node newLeaf = new Node(i);
        if (t == null)
            t = newLeaf;
        Node current = t;
        Node piggy = null;
        while (current != null){
            piggy = current;
            int c = current.getData().compareTo(i);
            if (c < 0){
                cur = cur.getLeft();
            } else if (c > 0){
                cur = cur.getRight();
            }
        }
        if (i > piggy.getData())
            piggy.setRight(newLeaf);
        else if (i < piggy.getData())
            piggy.setLeft(newLeaf);

	    //Create new node n
	    //Search for the value of n but use a piggyback pointer
	    //When lead pointer (T) gets to null, piggyback (T2) will be at the
         	//node before the insertion point
	//Insert new node to the left or right of T2 as appropriate
    }

    public String toString() {
	String s = "" + r.getData() + "\n";
	Node tmpLeft = r.getLeft();
	Node tmpRight = r.getRight();
	s = s + tmp.getData() + "\n";
	while (tmp != null) {
	    s = s + tmpLeft.getLeft().getData() + "   " + tmpLeft.getRight().getData() + "       " + tmpRight.getLeft().getData() + "   " + tmpRight.getRight().getData();
	    tmpLeft = 
	}
    }

    public static void main(String[] args) {
	BST s = new BST(new Node(17));
    }

}
