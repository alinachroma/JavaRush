package task0421;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s1 = br.readLine();
    	String s2 = br.readLine();
    	
    	int l1 = s1.length();
    	int l2 = s2.length();
    	
    	
    	if (s1.equals(s2)) {
    		System.out.println("Same names");
    	}
    	else if (!(s1.equals(s2)) && l1 == l2) {
    		System.out.println("Names are the same length");
    	}	
    }
}
