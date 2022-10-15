package week3.day1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String replace="";
		String[]split=text.split(" ");
		System.out.println(Arrays.toString(split));
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					count++;
					
				}
			}
			
		}
		if(count>1) {
          replace=text.replace("java", "");
		System.out.println(replace);
		}else {
			System.out.println("displaying string without duplicate words " +text);
		}

	}

}
