package collectionsprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[]data= {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet<Integer>data1=new TreeSet<Integer>();
		for(int i=0; i<data.length;i++) {
		data1.add(data[i]);
		}
		System.out.println(data1);
		
	List<Integer>data2=new ArrayList<Integer>(data1);
	int size=data2.size();
	System.out.println("the second largest num is " +data2.get(size-2));
  




	}
}


