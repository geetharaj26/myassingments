package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		int count=0;
		for(int i=1;i<=n;i++){
			if(n % i==0) {
			count++ ;
			}
		}
		if(count==2)
				System.out.println("the number is  prime number");
			
			else { 
				System.out.println("the number is not a prime number ");
			
			
		}

	}

}
