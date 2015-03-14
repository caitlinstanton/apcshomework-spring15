import java.util.*;

public class ListDriver{
    
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i = 0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.find(4));
	l.insert(4,"C");
	System.out.println(l);
	l.insert(0,"sup");
	System.out.println(l);
    }
		
}
