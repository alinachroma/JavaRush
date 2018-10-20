package task0419;
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
    	String s4 = br.readLine();
    	
    	int n1 = Integer.parseInt(s1);
    	int n2 = Integer.parseInt(s2);
    	int n3 = Integer.parseInt(s3);
    	int n4 = Integer.parseInt(s4);
    	
    	int a = Math.max(n1, n2);
    	int b = Math.max(n3, n4);
    	int c = Math.max(a, b);
    	
    	if (n1 == n2 && n2 == n3 && n3 == n4) 
    	{
    		System.out.println(n1);
    	} 
    	else
    	{
    		System.out.println(c);
    	}
    }
}
