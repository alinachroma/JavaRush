package task0432;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	String N = br.readLine();
    	int nN = Integer.parseInt(N);
    	int i = 1;
    	
    	while (i <= nN) {
    		i++;
    		System.out.println(s);
    	}	
    }
}
