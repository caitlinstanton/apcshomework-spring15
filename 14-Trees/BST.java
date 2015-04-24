public class BST {

    private Node root;
    
    public BST() {
	root = new Node();
    }

    public BST(Node n) {
	root = n;
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
	//Insert as a new leaf
	    //Create new node n
	    //Search for the value of n but use a piggyback pointer
	    //When lead pointer (T) gets to null, piggyback (T2) will be at the
         	//node before the insertion point
	//Insert new node to the left or right of T2 as appropriate

        Node newLeaf = new Node(i);
	System.out.println(newLeaf);
        if (t == null)
            t = newLeaf;
        Node cur = t;
        Node piggy = null;
        while (cur != null){
            piggy = cur;
            int c = i.compareTo(root.getData());
	    System.out.println("diff:" + c);
	    System.out.println("data:" + cur.getData());
            if (c < 0){
		System.out.println("less");
                cur = cur.getLeft();
            } else if (c > 0){
		System.out.println("more");
                cur = cur.getRight();
            }
	    System.out.println("HAI");
        }
        if (i > piggy.getData()) {
	    System.out.println("right");
            piggy.setRight(newLeaf);
	}
	else if (i < piggy.getData()) {
	    System.out.println("left");
            piggy.setLeft(newLeaf);
	}
    }

    public String toString(Node root) {
	String result = "";
	if (root == null)
	    return "";
	result += toString(root.getLeft());
	System.out.println("THIS IS LEFT: " + root.getLeft());
	result += toString(root.getRight());
	result += root.getData().toString();
	return result;
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
