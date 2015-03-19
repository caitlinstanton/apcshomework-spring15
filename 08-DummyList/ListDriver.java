import java.util.*;
import java.io.*;
import java.lang.System;

/*
From fastest to slowest:
ArrayList
Built-in Linked List
LList
*/

public class ListDriver{
    
    public static void main(String[] args) {
	Random rn = new Random();
	/*
	long start, elapsed;
	LList l = new LList();
	LinkedList LL = new LinkedList();
	ArrayList<Integer> al = new ArrayList<Integer>();

	for (int i = 0; i < 50000; i++){
	    l.add(rn.nextInt(11));
	    LL.add(rn.nextInt(11));
	    al.add(rn.nextInt(11));
	}

	int alSum = 0;
	start = System.currentTimeMillis();
	for(int i = 0; i < al.size(); i++){
	    alSum = alSum + al.get(i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Array List: " + elapsed);

	int lSum = 0;
	start = System.currentTimeMillis();
	for(int i = 0; i < l.size(); i++){
	    lSum = lSum + l.get(i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("LList: " + elapsed);

	int LLSum = 0;
	start = System.currentTimeMillis();
	for(int i = 0; i < LL.size(); i++){
	    LLSum = LLSum + (int)LL.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Built-in Linked List: " + elapsed);
	*/

	LList l = new LList();
	for (int i = 0; i < 10; i++) {
	    l.add(i);
	}

	//NON-JAVA WAY OF PRINTING A LIST INSTEAD OF THE TOSTRING() METHOD
	Node t = start.getNext();
	while (t != null) {
	    System.out.println(t.getData());
	    t = t.getNext();
	}

	System.out.println(l);
	System.out.println("The 0th element is: " + l.get(0));
	l.add(4,98);
	System.out.println(l);
	l.add(0,420);
	System.out.println(l);
	System.out.println("Length = " + l.size());
	System.out.println("Element removed: " + l.remove(4));
	System.out.println(l);
	System.out.println("Length = " + l.size());	
    }
		
}
