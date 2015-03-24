public class Driver {

    public static void main(String[] args) {
	myStack n = new myStack();
	String s = "HELLOOOO";
	n.push(s);
	String x = "world";
	n.push(x);
	System.out.println(n);
	System.out.println(n.empty());
	System.out.println(n.top());
    }

}
