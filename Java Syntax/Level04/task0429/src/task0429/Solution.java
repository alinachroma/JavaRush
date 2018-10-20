package task0429;
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
    	
    	int posN = 0;
    	int negN = 0;
    	
    	if (n1 > 0)
    	{
            posN++;
        }
    	else if (n1 < 0)
    	{
    		negN++;
    	}
    	
        if (n2 > 0)
        {
            posN++;
        }
        else if (n2 < 0)
        {
        	negN++;
        }
        
        if (n3 > 0)
        {
            posN++;
        }
        else if (n3 < 0)
        {
        	negN++;
        }
        
        System.out.print("a number of negative numbers: " + negN);
        System.out.print("a number of positive numbers: " + posN);
    }
}
