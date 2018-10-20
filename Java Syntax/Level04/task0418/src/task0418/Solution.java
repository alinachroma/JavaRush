package task0418;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
       run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	String s2 = br.readLine();
    	
    	int n = Integer.parseInt(s);
    	int n2 = Integer.parseInt(s2);
    	
    	if (n == n2) 
    	{
    		System.out.println(n);
    	}
    	else if (n > n2) 
    	{
    		System.out.println(n2);
    	} 
    	else 
    	{
    		System.out.println(n);
    	}
    }
}