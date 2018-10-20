package task0426;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	int n = Integer.parseInt(s);
    	
    	if (n < 0 && n % 2 == 0) {
    		System.out.println("negative even number");
    	}
    	else if (n < 0 && n % 2 != 0) {
    		System.out.println("negatve odd number");
    	}
    	else if (n == 0) {
    		System.out.println("zero");
    	}
    	else if (n > 0 && n % 2 == 0) {
    		System.out.println("positive even number");
    	}
    	else if (n > 0 && n % 2 != 0) {
    		System.out.println("positive odd number");
    	}
    	
    }
}
