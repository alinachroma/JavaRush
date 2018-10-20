package task0423;
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
    	
    	if (nage > 20) 
    	{
    		System.out.println("И 18-ти достаточно");
    	}
    }
}

