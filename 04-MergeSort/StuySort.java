import java.io.*;
import java.util.*;

public class StuySort {

//ARRAY
    public int[] merge(int[] A, int[] B){
	int[] mergedList = new int[A.length + B.length];
	int iA = 0;
	int iB = 0;
	for(int i = 0; i < A.length + B.length;i++){
	    if(iA < A.length && iB < B.length){
		if(A[iA] <= B[iB]){
		    mergedList[i] = A[iA];
		    iA++;
		} else {
		    mergedList[i] = B[iB];
		    iB++;
		}
	    } else if (iA < A.length){
		mergedList[i] = A[iA];
		iA++;
	    } else {
		mergedList[i] = B[iB];
		iB++;
	    }
	}
	return mergedList;
    }

    public int[] mergeSort(int[] n){
     	int[] A = new int[n.length/2];
	int[] B = new int[n.length - n.length/2];
	if(n.length <= 1){
	    return n;
	} else {
	    int iB = 0;
	    for(int i = 0; i < n.length; i++){ //splits array
		if(i < n.length/2){
		    A[i] = n[i];
		}
		else {
		    B[iB] = n[i];
		    iB++;
		}
	    }
	    n = merge(mergeSort(A),mergeSort(B));
	}
	return n;
    }
    
//ARRAYLIST
    public ArrayList<Integer> mergeSort(ArrayList<Integer> n) {
	if(n.size() <= 1) {
	    return n;
	}
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
        return merge(mergeSort(left), mergeSort(right));
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
	    ArrayList<Integer> mergedList = new ArrayList<Integer>();
	    while(left.size() > 0 && right.size() > 0) {
		if(left.get(0) < right.get(0)) {
		    mergedList.add(left.get(0));
		    left.remove(0);
		} else {
		    mergedList.add(right.get(0));
		    right.remove(0);
		}
	    }
	    if(left.size() > 0) {
		while(left.size() > 0) {
		    mergedList.add(left.get(0));
		    left.remove(0);
		    }
	    } else if (right.size() > 0) {
		while(right.size() > 0) {
		    mergedList.add(right.get(0));
		    right.remove(0);
		    }
	    }
	    return mergedList;
    }

    
    public static void main(String[] args) {
    	StuySort m = new StuySort();
    	
	ArrayList<Integer> A = new ArrayList<Integer>();
	Random rn = new Random();
	for (int i = 0; i < 10; i++) {
	    A.add(rn.nextInt(15));
	}
	System.out.println("Array: " + A);
	System.out.println("Sorted: " + m.mergeSort(A));
	
	int[] list = new int[10];
	Random rn = new Random();
	for (int i = 0; i < list.length; i++) {
	    list[i] = rn.nextInt(20);
	}
	System.out.println("Original: " + Arrays.toString(list));
	list = m.mergeSort(list);
	System.out.println("Sorted: " + Arrays.toString(list));
    }
	
}
