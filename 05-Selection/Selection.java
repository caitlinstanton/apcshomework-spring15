import java.io.*;
import java.util.*;

public class Selection {

    private int[] L;
    private Random rn = new Random();

    public Selection(int[] n) {
	L = new int[n.length];
	for (int i = 0; i < n.length; i++) {
	    L[i] = n[i];
	}
	System.out.println("ARRAY: " + Arrays.toString(L));
    }

    public int select(int[] L, int k, int SI, int EI) {
	System.out.println("Finding the " + k +"th element");
        int pivot = L[EI];
        int low = SI;
        int high = EI;
	int highVal, lowVal;
        while (low < high) {
            if (L[low] < pivot) {
                low = low + 1;
            } else {
                high = high - 1;
                highVal = L[high];
                lowVal = L[low];
                L[high] = lowVal;
                L[low] = highVal;
            }
        }
	L[EI] = L[high]; //swaps element first right side element with pivot
	L[high] = pivot;
	if (high == k) {
	    return L[high];
	} else if (high < k) {
	    return select(L,k,SI+1,EI);
	} else {
	    return select(L,k,SI,EI - 1);
	}
    }

    public static void main(String[] args) {
	int[] L = new int[10];
	Random rn = new Random();
	for (int i = 0; i < L.length; i++) {
	    L[i] = rn.nextInt(20) + 15;
	}
	Selection s = new Selection(L);
	System.out.println(s.select(L,4,0,9));
    }
}
