package task0415;
import java.io.*;



public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String a = br.readLine();
    	String b = br.readLine();
    	String c = br.readLine();
    	
    	int na = Integer.parseInt(a);
    	int nb = Integer.parseInt(b);
    	int nc = Integer.parseInt(c);
    	
    	if (((na + nb) > nc) && ((na + nc) > nb) && ((nc + nb) > na))
    	{
    		System.out.println("A triangle exists.");
    	}
    	
    	if ((na > (nb + nc)) || (nb > (nc + na)) || (nc > (na + nb)))
    		
    	{
    		System.out.println("A triangle doesn't exist.");
    	}
    	
    	else if ((na == (nb + nc)) || (nb == (nc + na)) || (nc == (na + nb))) 
    	{
    		System.out.println("A triangle doesn't exist.");
    	}
    }
}


