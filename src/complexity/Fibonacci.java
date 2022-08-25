package complexity;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++)
			System.out.println(fiboFormula(i));

	}
	
	public static long fiboFormula(int n) {
		
		double term1 = Math.pow(((1+ Math.sqrt(5))/2),n);
		double term2 = Math.pow(((1- Math.sqrt(5))/2),n);
		
		return (long) ((long) 1/Math.sqrt(5) * (term1 - term2));
	}

}
