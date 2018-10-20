package task0425;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s1 = br.readLine();
    	String s2 = br.readLine();
    	
    	int a = Integer.parseInt(s1);
    	int b = Integer.parseInt(s2);
    	
    	if (a > 0 && b > 0) 
    	{
    		System.out.println("1");
    	}
    	else if (a < 0 && b > 0) 
    	{
    		System.out.println("2");
    	}
    	else if (a < 0 && b < 0) 
    	{
    		System.out.println("3");
    	}
    	else if (a > 0 && b < 0) 
    	{
    		System.out.println("4");
    	}
    }
}
