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
	/*
	Random rn = new Random();
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
	*/

	//LList<String> l = new LList<String>();
	//LList<Integer> l2 = new LList<Integer>();
	//ArrayList<String> l = new ArrayList<String>();
        //ArrayList<Integer> l2 = new ArrayList<Integer>();
	LinkedList<String> l = new LinkedList<String>();
	LinkedList<Integer> l2 = new LinkedList<Integer>();

	l.add("Hello");
	l.add("world");
	l.add("abc");
	l.add("something");
	l.add("else");
	
	System.out.println(l);

	for (int i=0;i < 5; i++){
	    l2.add(i);
	}
	
	System.out.println(l2);
	System.out.println();

	Iterator<String> i = l.iterator();
	Iterator<Integer> i2 = l2.iterator();
	while (i.hasNext())
	    System.out.println(i.next());
	while (i2.hasNext())
	    System.out.println(i2.next());


	//for each loop
	//STRUCTURE: for (variable : set of data)
	for (String s : l) {
	    System.out.println(s + ", ");
	}
	System.out.println();
	for (int j : l2) {
	    System.out.println(j + ", ");
	}
	
    }
}
