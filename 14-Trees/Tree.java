public class Tree {

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

    public void insert(Node T) {
	if (T == null) {
	    //Print the node you are inserting
	}
	//Insert as a new leaf
	    //Create new node n
	    //Search for the value of n but use a piggyback pointer
	    //When lead pointer (T) gets to null, piggyback (T2) will be at the
         	//node before the insertion point
	//Insert new node to the left or right of T2 as appropriate
    }

}
