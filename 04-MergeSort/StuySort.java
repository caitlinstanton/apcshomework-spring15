import java.io.*;
import java.util.*;

public class StuySort {
	
    public ArrayList<Integer> mergeSort(ArrayList<Integer> n) {
	if(n.size() <= 1) {
	    return n;
	}
	ArrayList<Integer> result = new ArrayList<Integer>();
	
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	int middle = n.size()/2;

	for(int i = 0; i < n.size(); i++) {
	    if(i < middle) {
		left.add(n.get(i));
	    } else {
		right.add(n.get(i));
	    }
	}
	left = mergeSort(left); 
	right = mergeSort(right);

        result = merge(left, right);
	return result;
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
	    ArrayList<Integer> mergedList = new ArrayList<Integer>();
	    while(left.size() > 0 || right.size() > 0) {
		if(left.size() > 0 && right.size() > 0) {
		    if(left.get(0) < right.get(0)) {
			mergedList.add(left.get(0));
			left.remove(0);
		    } else {
			mergedList.add(right.get(0));
			right.remove(0);
		    }
		} else if(left.size() > 0) {
		    mergedList.add(left.get(0));
		    left.remove(0);
		} else if(right.size() > 0) {
		    mergedList.add(right.get(0));
		    right.remove(0);
		}
	    }
	    return mergedList;
    }
    
    public static void main(String[] args) {
	ArrayList<Integer> A = new ArrayList<Integer>();
	Random rn = new Random();
	for (int i = 0; i < 10; i++) {
	    A.add(rn.nextInt(15));
	}
        StuySort m = new Mergesort();
	System.out.println("Array: " + A);
	System.out.println(m.mergeSort(A));
    }
	
}
