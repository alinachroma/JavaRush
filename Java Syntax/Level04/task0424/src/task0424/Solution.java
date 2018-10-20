package task0424;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s1 = br.readLine();
    	String s2 = br.readLine();
    	String s3 = br.readLine();
    	
    	int n1 = Integer.parseInt(s1);
    	int n2 = Integer.parseInt(s2);
    	int n3 = Integer.parseInt(s3);
    	
    	if (n1 == n2) 
    	{
    		System.out.println("3");
    	}
    	else if (n2 == n3) 
    	{
    		System.out.println("1");
    	}
    	else if (n1 == n3) 
    	{
    		System.out.println("2");
    	}
    }
}
