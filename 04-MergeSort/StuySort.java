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
		result.add(A.remove(0));
	    }
	    if (B.get(0) < A.get(0)) {
		result.add(B.remove(0));
	    }
	    counter++;
	}
	return result;
    }

    public static void main(String[] args) {
	StuySort c = new StuySort();
	ArrayList<Integer> A = new ArrayList<Integer>();
	ArrayList<Integer> B = new ArrayList<Integer>();
	Random rn = new Random();
	for (int i = 0; i < 5; i++) {
	    A.add(rn.nextInt(10));
	}
	for (int j = 0; j < 5; j++) {
	    B.add(rn.nextInt(10));
	}
	System.out.println(A);
	System.out.println(B);
	System.out.println(c.merge(A,B));
    }
    
}
