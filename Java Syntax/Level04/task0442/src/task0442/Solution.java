package task0442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int base = 0;
			String inp = br.readLine();
			int i1 = Integer.parseInt(inp);
			list.add(i1);
			
			if(i1 == (-1)) {
				for (int number : list) {
					base = base + number;
				}
				System.out.println(base);
				break;
			}
		}    
	}
}
