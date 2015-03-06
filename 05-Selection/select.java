import java.util.*;
import java.io.*;

public class Selction { 

  private Random rn = new Random();
  
  public int select(int[] L, int k, int L, int H) {
    int pivotIndex = rn.nextInt((H - L) + 1) + L;
    int pivot = L[pivotIndex];
    int highVal = L[H];
    L[pivotIndex] = highVal;
    L[H] = pivot;
    L = Li;
    H 
    
  }

}
