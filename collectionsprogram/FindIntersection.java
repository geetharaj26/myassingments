package collectionsprogram;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		List<Integer>list1 =new ArrayList<Integer>();
		List<Integer>list2=new ArrayList<Integer>();
		for(int i=0;i<=a.length-1;i++) {
			list1.add(a[i]);
		}
		for(int i=0;i<=b.length-1;i++) {
			list2.add(b[i]);
		}
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println("the intersection numbers ");
		for(int i=0;i<a.length-1;i++) {
			for (int j=0;j<a.length-1;j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println(list1.get(i));
				}
			}
		}
	}

}
