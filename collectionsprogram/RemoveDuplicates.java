package collectionsprogram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="PayPal";
		String l= s.toLowerCase();
        char[]s1=l.toCharArray();
        Set<Character>charset=new LinkedHashSet<Character>();
        Set<Character>dupset=new LinkedHashSet<Character>();
        for( int i=0;i<=s1.length-1;i++) {
        	if(!charset.add(s1[i])) {
        		dupset.add(s1[i]);
        	}
        }
        System.out.println(dupset);
        charset.removeAll(dupset);
        
        System.out.println(charset);
        List<Character> list=new ArrayList<Character>(charset);
        for(int i=0;i<list.size();i++) {
        	if(list.get(i)!=' ') {
        		System.out.println(list.get(i));
        		
        	}
        }
	}

}
