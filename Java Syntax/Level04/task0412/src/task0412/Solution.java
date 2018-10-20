package task0412;
import java.io.*;


public class Solution {
	
    public static void main(String[] args) throws Exception {
       run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String number = br.readLine();
    	int nNumber = Integer.parseInt(number);
    	
    	if (nNumber > 0) {
    		int result = nNumber * 2;
    		System.out.println(result);
    	}
    	
    	if (nNumber < 0) {
    		int result = nNumber + 1;
    		System.out.println(result);
    	}
    	
    	if (nNumber == 0) {
    		System.out.println(nNumber);
    	}
    }
}