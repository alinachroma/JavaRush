package task0436;
import java.io.*;

/*
Rectangle 
*/
 
public class Solution {
	
    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String firstN = br.readLine();
    	String nextN = br.readLine();
    	
    	int m = Integer.parseInt(firstN);
    	int n = Integer.parseInt(nextN);
    	
    	for (int h = 0; h < m; h++) {
    		for (int w = 0; w < n; w++) {
    			System.out.print('8');
    		}
    		
    		System.out.println();
    	}
    }
}

