package week1.day2;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {
		int n[]= {2,3,4,1,5};
		Arrays.sort(n);
		System.out.println("Arrays.toString(n)");
		for(int i=n.length-1;i>=0;i--) {
			System.out.println(n[i]); 
		}

	}

}
