package task0427;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	int n = Integer.parseInt(s);
    	int l = s.length();
    	
    	if (n >= 1 && n <= 999) {
    	
    	   if (n % 2 == 0 && l == 1) {
    		   System.out.println("even single digit");
    	   }
    	   else if (n % 2 != 0 && l == 1) {
    		   System.out.println("odd single digit");
    	   }
    	   else if (n % 2 == 0 && l == 2) {
    		   System.out.println("even double digit");
    	   }
    	   else if (n % 2 != 0 && l == 2) {
    		  System.out.println("odd double digit");
    	   }
    	   else if (n % 2 == 0 && l == 3) {
    		   System.out.println("even three-digit number");
    	   }
    	   else if (n % 2 != 0 && l == 3) {
    		   System.out.println("odd three-digit number");
    	   }	
    	}
    }
}
