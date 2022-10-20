package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String s="geetha";
		char[]s1 =	s.toCharArray();
		char dup=0;
	
	Set<Character>set=new HashSet<Character>();
	for(int i=0;i<s1.length-1;i++) {
		if(!set.add(s1[i])) {
			dup=s1[i];
			set.remove(dup);
		}
	}

	System.out.println("the unique characters " +set);	

	}

}
