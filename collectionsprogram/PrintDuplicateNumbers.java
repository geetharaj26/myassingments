package collectionsprogram;

import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[]data= {4,3,6,8,29,1,2,4,7,8};
		TreeSet<Integer>set=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++) {
			if(!set.add(data[i])) {
				System.out.println("the duplictaes numbers are " +data[i]);
		}
			

	}
		
	}
}


