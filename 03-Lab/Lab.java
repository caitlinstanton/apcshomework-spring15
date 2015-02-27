import java.io.*;
import java.util.*;

public class Lab{
    public int[][] lake = new int[4][6];
    public Random rand = new Random();
    
    public Lab(){
	for (int i = 0; i<lake.length;i++){
	    for (int k = 0; k < lake[0].length;k++){
		lake[i][k] = rand.nextInt(11) + 20;
	    }}
    }
       

    public int makeLake(int r, int c, int e){
	int indexr = r;
	int indexc = c;
	int diff;
	int depth = 0;
	for (int i = r; i < r + 3; i++){
	    for (int k = c; k < c + 3; k++){
		if (lake[i][k] > lake[indexr][indexc]){
		    indexr = i;
		    indexc = k;
		}}}
	System.out.println(lake[indexr][indexc]);
	diff = lake[indexr][indexc] - e;
	System.out.println(diff);
	for (int q = r; q < r + 3; q++){
	    for (int p = c; p < c + 3; p++){
		if (lake[q][p] > diff){
		    lake[q][p] = diff;
		}}}
	
	for (int w = 0; w < lake.length; w++){
	    for (int v = 0; v < lake[0].length; v++){
		depth = depth + lake[w][v];
	    }}
	return depth*72*72;
    }
	
    public String toString(){
	String s = "";
	for (int i = 0; i < lake.length; i++) {
	    for (int j = 0; j < lake[i].length; j++) {
		s = s + lake[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }


    public static void main(String[] args){
	Lab l = new Lab();
	System.out.println(l);
	System.out.println(l.makeLake(1,3,4));
	System.out.println(l);
	
    }
	

}
