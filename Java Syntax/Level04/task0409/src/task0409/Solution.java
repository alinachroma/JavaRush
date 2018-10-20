package task0409;

public class Solution {
	
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        
    	int c = abs(10-a);
    	int d = abs(10-b);
    	
    	if (c > d)
        {
        	System.out.println(b); 
        }
       
        if (c < d)
        {
        	System.out.println(a);
        }
        
        if (c == d) 
        {
        	System.out.println(a);
        }
       
    }

    public static int abs(int a) {
    	
        if (a < 0) 
        {
            return -a;
        } 
        else 
        {	
            return a;
        }
    }
}

