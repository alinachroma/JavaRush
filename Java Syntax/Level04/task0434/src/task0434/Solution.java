package task0434;
import java.io.*;

/* 
The multiplication table 10x10
*/


public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() {
    	int m = 0;
    	
    	while (m < 10) {
    		m++;
    		int n = 0;
    		
    		while (n < 10) {
    			n++;
    			int mn = m*n;
    			System.out.print(mn + " ");
    		}
    		System.out.println();
    		}
    	}
    }




    

