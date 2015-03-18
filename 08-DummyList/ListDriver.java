import java.util.*;

public class ListDriver{
    
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i = 0; i < 10; i++){
	    l.add(i);
	}
	System.out.println(l);
	System.out.println(l.get(4));
	System.out.println(" ");

	l.add(4,98);
	System.out.println(l);
	System.out.println(" ");

	l.add(0,420);
	System.out.println(l);
	System.out.println(" ");

	System.out.println(l.getLength());
	System.out.println(" ");

	System.out.println("Element removed: " + l.remove(4));
	System.out.println(l);
	System.out.println(" ");

	System.out.println(l.getLength());
    }
		
}