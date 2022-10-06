package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
   int[] nums = {10,40,30,20,10,60,90,60};
   Arrays.sort(nums);
   System.out.println(Arrays.toString(nums));
   System.out.println("duplicate values are");
   for(int i=0;i<nums.length;i++) {
	   for(int j=i+1;j<nums.length;j++) {
		   if(nums[i]==nums[j]) {
			   System.out.println(nums[i]); 
			   
		   }
	   }
   }
	}
}
   

	

	
