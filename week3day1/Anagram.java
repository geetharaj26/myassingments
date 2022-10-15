package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int t1=text1.length();
		int t2=text2.length();
		if(t1==t2) {
			System.out.println("length of both strings are same");
		}else {
			System.out.println("length not same");
		}
		char[] a=text1.toCharArray();
		char[]b=text2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("both the arrays has same value");
		}else {
			System.out.println("no same value");
		
			
		}
		
		
		
		

	}

}
