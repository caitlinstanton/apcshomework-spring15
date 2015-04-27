public class BST {

    private Node r;
    
    public BST() {
	root = new Node();
    }

    public BST(Node n) {
	root = n;
    }
    
    /*
    public Node search(Node t, Integer i) {
	while (t != null) {
	    if (t.getData() < i) {
		t = t.getRight();
	    } else if (t.getData() > i) {
		t = t.getLeft();
	    } else {
		return t;
	    }
	}
	return null;
    }
    */

    //RECURSIVE VERSION
    public Node search(Node t, int i) {
	if (t == null || t.getData() == i) {
	    return null;
	} else if (i < t.getData()) {
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i) {
	Node n = search(r,i);
	if (n == null) {
	    return "NOT FOUND";
	} else {
	    return n.toString();
	}
    }

    public void insert(int i) {
	//Insert as a new leaf
	    //Create new node n
	    //Search for the value of n but use a piggyback pointer
	    //When lead pointer (T) gets to null, piggyback (T2) will be at the
         	//node before the insertion point
	//Insert new node to the left or right of T2 as appropriate

        Node newLeaf = new Node(i);
        Node cur = r;
        Node piggy = null;
        if (r == null)
            r = newLeaf;
        while (cur != null){
            piggy = cur;
	    if (t.getData() == i) {
		return;
	    } else if (t.getData() < i) {
            	t = t.getRight();
            } else if (t.getData() > i) {
            	t = t.getLeft();
            } else {
            	return;
            }
        }
        if (i > piggy.getData()) {
            piggy.setRight(newLeaf);
	} else {
            piggy.setLeft(newLeaf);
	}
    }

    public String toString(Node t) {
	String result = "";
	if (t == null)
	    return "";
	result = t.toString() + toString(t.getLeft()) + toString(t.getRight());
	return result;
    }

    public String traverse(Node t) {
	
    }

    public static void main(String[] args) {
	Node n = new Node(17);
	BST b = new BST(n);
	System.out.println(b.toString(n));
	System.out.println();

	b.insert(n,22);
	System.out.println();

	b.insert(n,15);
	System.out.println();

	System.out.println(b.toString(n));

	b.insert(n,9);
	System.out.println();

	b.insert(n,27);
    }
    
}
