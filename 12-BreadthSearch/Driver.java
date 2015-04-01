import java.lang.Integer;

public class Driver {

    public static void main(String[] args) {
	myQueue t = new myQueue();
	System.out.println(t.empty());
	for (int i = 0 ; i < 10 ; i++) {
	    t.enQueue(i, i+3);
	}
	System.out.println(t);
	System.out.println(t.empty());
	//System.out.println(t.head());
	//System.out.println(t.deQueue());
	System.out.println(t);
    }
}
