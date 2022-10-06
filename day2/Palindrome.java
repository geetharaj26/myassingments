package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num =34343;
		int num2=num;
		int r=0;
		int i;
		for(i=num;i>0;i=i/10) {
			r=(r*10)+i%10;
		}
			if(r==num2) {
				System.out.println("number is palindrome");
			}
			else {
				System.out.println("number is not a palindrome");
			}
	
		}

	}


