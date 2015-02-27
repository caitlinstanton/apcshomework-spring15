import java.io.*;
import java.util.*;

public class StuySort {
    
    private ArrayList<Integer> A = new ArrayList<Integer>();
    private ArrayList<Integer> B = new ArrayList<Integer>();


    public StuySort() {

    }

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	while (A.size() > 0 && B.size() > 0) {
	    int counter = 0;
	    if (A.get(0) <= B.get(0)) {
		result.add(A.get(0));
		A.remove(0);
	    } else {
		result.add(B.get(0));
		B.remove(0);
	    }
	    counter++;
	}
	return result;
    }

    public static void main(String[] args) {
	StuySort c = new StuySort();
	ArrayList<Integer> A = new ArrayList<Integer>();
	ArrayList<Integer> B = new ArrayList<Integer>();
	A.add(2);
	A.add(5);
	A.add(9);
	A.add(14);
	B.add(6);
	B.add(13);
	B.add(19);
	B.add(21);
	System.out.println(A);
	System.out.println(B);
	System.out.println(c.merge(A,B));
    }
    
}
