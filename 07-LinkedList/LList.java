public class LList {
    
    private Node l;
    private int len;
    
    public LList() {
	l = new Node();
	len = 0;
	//ADDING THIS NEW, EMPTY NODE AT THE BEGINNING MEANS THAT YOU DON'T
	//REQUIRE AN IF STATEMENT TO CHECK IF YOU ARE ADDING TO THE VERY FRONT
	//OF THE LIST, SINCE THERE WILL ALWAYS BE A (NULL) ELEMENT BEFORE IT
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String find(int n) {
	Node tmp = l;
	int counter = -1;
	String s = "";
	for (tmp = l; tmp != null; tmp = tmp.getNext()) {
	    counter = counter + 1;
	    if (counter == n) {
	        s = s + tmp;
	    }
	}
	return s;
    }

    public void insert(int n, String s) {
	Node added = new Node(s);
	if (n == 0) {
	    add(s);
	} else {
	    Node tmp = l;
	    for (int i = 0; i < n - 1; tmp = tmp.getNext()) {
		if (tmp == null) {
		    throw new IndexOutOfBoundsException();
		}
		i++;
	    }
	    added.setNext(tmp.getNext());
	    tmp.setNext(added);
	}
    }
    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
}
