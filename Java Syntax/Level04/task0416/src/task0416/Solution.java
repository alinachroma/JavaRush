package task0416;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	double t = Double.parseDouble(s);
    	double tRest = t % 5;
    	
    	if (tRest < 3 && tRest != 0) {
    		System.out.println("зелёный");
    	}
    	
    	if (tRest == 0) {
    		System.out.println("зелёный");
    	}
    	
    	if (tRest >= 3 && tRest < 4) {
    		System.out.println("жёлтый");
    	}
    	
    	if (tRest >= 4 && tRest < 5) {
    		System.out.println("красный");
    	}
    }
}