public class ArrayQueue {

    private int[] data;
   
    public ArrayQueue(int n) {
	data = new int[n];
    }
    
    public ArrayQueue() {
	data = new int[0];
    }
    
    public void enQueue(int s) {
	int[] data2 = new int[data.length + 1];
	for (int i = 0 ; i < data.length ; i++) {
	    data2[i] = data[i];
	}
	data2[data.length] = s;
	data = data2;
    }
    
    public int head() {
	return data[0];
    }
    
    public int deQueue() {
	int[] data2 = new int[data.length - 1];
	int retVal = data[0];
	for (int i = 0 ; i < data.length - 1 ; i++) {
	    data2[i] = data[i + 1];
	}
	data = data2;
	return retVal;
    }
    
    public boolean empty() {
	return (data.length == 0);
    }
    
    public String toString() {
	String s = "";
	for (int i : data) {
	    s = s + i + "\n";
	}
	return s;
    }
}
