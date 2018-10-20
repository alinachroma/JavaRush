package task0408;


public class Solution {
	
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5)   
      	System.out.println("The number is smaller than 5");
        
        if (a > 5)
        System.out.println("The number is bigger than 5");
        
        if (a == 5)
        System.out.println("The number is 5");
    }
}

