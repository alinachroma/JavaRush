package task0428;
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
    	
    	int num = 0;
    		
    	if (n1 > 0)
    	{
            num++;
        }
    	
        if (n2 > 0)
        {
            num++;
        }
        
        if (n3 > 0)
        {
            num++;
        }
        
        System.out.print(num);	   
    }
}
