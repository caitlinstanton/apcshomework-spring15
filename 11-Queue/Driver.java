import java.lang.Integer;

public class Driver {

    public static void main(String[] args) {
	myQueue<Integer> t = new myQueue<Integer>();
	System.out.println(t.empty());
	for (int i = 0 ; i < 10 ; i++) {
	    t.enQueue(i);
	}
	System.out.println(t);
	System.out.println(t.empty());
	System.out.println(t.head());
	System.out.println(t.deQueue());
	System.out.println(t);
    }
}
