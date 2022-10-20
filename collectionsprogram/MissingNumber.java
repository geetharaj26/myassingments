package collectionsprogram;

import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data= {1,2,3,5,5,6,7,8,9,10};
		
TreeSet<Integer>data1=new TreeSet<Integer>();
 for(int i=0;i<=data.length-1;i++) {
  data1.add(data[i]);
  
  System.out.println(data1);
 
	}
 for(int j=1;j<data.length-1;j++) {
	 if(!data1.contains(j)) {
		 System.out.println("the missing number is " +j);
	 }
 }
	

	}
}
