public class Tree {

    private Node root;
    
    public Tree() {
	root = new Node();
    }

    public Tree(Node n) {
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

    public void insert(Integer i) {
	Node T = root;
	if (T == null) {
	    root = new Node(i);
	    root.setLeft(null);
	    root.setRight(null);
	    System.out.println(root);
	}
	//Insert as a new leaf
	Node n = new Node(T.getData());
	search(T,n.getData());
	    //Create new node n
	    //Search for the value of n but use a piggyback pointer
	    //When lead pointer (T) gets to null, piggyback (T2) will be at the
         	//node before the insertion point
	//Insert new node to the left or right of T2 as appropriate
    }

}
