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
	    System.out.println(T);
	}

}
