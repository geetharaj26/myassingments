package week3.day1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String rev ="";
		char[]ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
		rev=rev+ch[i];
		
		}
		if(rev.equals(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
			
			
		
		}

	}

}
