package task0422;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String name = br.readLine();
    	String age = br.readLine();
    	int nage = Integer.parseInt(age);
    	
    	if (nage < 18) {
    		System.out.println("Подрасти еще");
    	}
    }
}
