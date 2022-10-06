package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int inputrange=15;
		int n1=0, n2=1;
		int sum=0;
		System.out.println("the fibonacci series of the input range");
for(int i=1;i<=inputrange;i++) {
	sum=n1+n2;
	n1=n2;
	n2=sum;
	System.out.println("sum " +sum);
}
	}

}
