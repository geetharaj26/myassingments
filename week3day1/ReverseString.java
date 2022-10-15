package week3.day1;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s="geetha";
		char[]ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i=ch.length-1;i>=0;i--)
		
		System.out.print(ch[i]);
		

	}

}
