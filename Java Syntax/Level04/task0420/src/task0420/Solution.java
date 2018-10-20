package task0420;
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
    	
    	int min = Math.min(n1,n2);
    	int max = Math.max(n1,n2);
    	
    	if (n3 < min) 
    	{
    		System.out.println(max + " " + min + " " + n3);
    	} 
    	else if (n3 > min && n3 < max)
    	{
    		System.out.println(max + " " + n3 + " " + min);
    	}
    	else if (n3 > min && n3 > max)
    	{
    		System.out.println(n3 + " " + max + " " + min);
    	}
    	else if (n3 == max) 
    	{
    		System.out.println(n3 + " " + max + " " + min);
    	}
    	else if (n3 == min) 
    	{
    		System.out.println(max + " " + min + n3);
    	}
    }
}
