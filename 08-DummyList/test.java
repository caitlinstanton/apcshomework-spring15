import java.io.*;
import java.util.*;
import java.lang.System;

public class test {

    public static void main(String[] args) {
	long t = System.currentTimeMillis();
	System.out.println(t);

	long start, elapsed;

	start = System.currentTimeMillis();

	Random rn  = new Random();
	int n = 10;

	//ARRAYLIST
	ArrayList<Integer> al = new ArrayList<Integer>();
	int sumAL = 0;
	for (int i = 0; i < n; i++) {
	    al.add(i,rn.nextInt(10));
	    sumAL = sumAL + al.get(i);
	}   

	//BUILT-IN LINKED LIST
	LinkedList<Integer> ll = new LinkedList<Integer>();
	int sumLL = 0;
	for (int j = 0; j < n; j++) {
	    ll.add(j, rn.nextInt(10));
	    sumLL = sumLL + ll.get(i);
	}

	//LINKED LIST
	LList myLL = new LList();
	int sumLList = 0;
	for (int k = 0; k < n; k++) {
	    myLL.add(k, rn.nextInt(10));
	    sumLList = sumLList + myLL.get(k);
	}
	elapsed = System.currentTimeMillis() - start;
    }
    
}
