package task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        
        if (((i1 == i2) && (i1 == i3))){
            System.out.println(i1);
        }
        if (((i3 > i1) && (i1 > i2)) || ((i2 > i1) && (i1 > i3))) {
            System.out.println(i1);
        }
        if (((i3 > i2) && (i2 > i1)) || ((i1 > i2) && (i2 > i3))) {
            System.out.println(i2);
        }
        if (((i1 > i3) && (i3 > i2)) || ((i2 > i3) && (i3 > i1))) {
            System.out.println(i3);
        }
        if (((i1 == i2) && !(i1 == i3))) {
            System.out.println(i1);
        }
        if (((i2 == i3) && !(i1 == i2))) {
            System.out.println(i2);
        }
        if (((i1 == i3) && !(i1 == i2))) {
            System.out.println(i3);
        }
    }
}
