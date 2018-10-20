package task0413;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String dayOfWeek = br.readLine();
    	int dow = Integer.parseInt(dayOfWeek);
    	
    	switch (dow) {
    	
    	    case 1:  System.out.println("понедельник");
    	             break;
    	    case 2:  System.out.println("вторник");
    	             break;
    	    case 3:  System.out.println("среда");
    	             break;
    	    case 4:  System.out.println("четверг");
    	             break;
    	    case 5:  System.out.println("пятница");
    	             break;
    	    case 6:  System.out.println("суббота");
    	             break;
    	    case 7:  System.out.println("воскресенье");
    	             break;
    	    default: System.out.println("такого дня недели не существует");
    	             break;
    	}
    }
}

