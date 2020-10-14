package task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        
        String year = br.readLine();
        String month = br.readLine();
        String day = br.readLine();

        System.out.println("My name is " + name + ".");
        System.out.println("I was born " + day + "." + month + "." + year);
    }
}
