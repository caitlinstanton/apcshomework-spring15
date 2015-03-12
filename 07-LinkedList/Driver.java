public class Driver {

    public static void main(String[] args) {
	Node n = new Node("hello");
	//System.out.println(n);

	Node n2 = new Node("world");
	//System.out.println(n2);

	n.setNext(n2);

	//System.out.println(n.getNext().getData());
	//System.out.println(n.getNext()); 
	         //same as the line before due to the toString method

	n.getNext().setData("pickle");
	//System.out.println(n2);
	//System.out.println(n.getNext().getData());

	n2.setData("watermelon");
	//System.out.println(n.getNext().getData());

	n2.setNext(new Node("abc"));
	//System.out.println(n.getNext().getNext().getData());

	n.getNext().getNext().setNext(new Node("yabba dabba doo"));

	Node temp = new Node("start");
	temp.setNext(n);
	n = temp; 
	        //points variable n to Node temp, making it the start of the list

	//System.out.println(temp);
	//System.out.println(n);
	//System.out.println(n.getNext());

        temp = n;
	while(temp != null) {
	    System.out.println(temp);
	    temp = temp.getNext();
	}
	System.out.println();
	for (temp = n; temp != null; temp = temp.getNext()) {
	    System.out.println(temp);
	}
    }

}
