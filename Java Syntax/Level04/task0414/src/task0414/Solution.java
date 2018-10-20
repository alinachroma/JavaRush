package task0414;
import java.io.*;



public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    	String year = br.readLine();
    	int nYear = Integer.parseInt(year);
    	
    	int v = 366;
    	int nv = 365;
 	
    	if ((nYear % 4 != 0) || (nYear % 4 == 0 && nYear % 100 == 0 && nYear % 400 != 0)) 
    	{
    		System.out.println("количество дней в году: " + nv);
    	}
    	else if ((nYear % 4 == 0 && (nYear % 100 != 0) || (nYear % 400 == 0))) {
    		
    		System.out.println("количество дней в году: " + v);
    	}
    }
}

