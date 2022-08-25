package recursion;

import java.io.Console;

public class Recursion_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message(10,1);
	}
	static void message(int n,int k) {
		if(k>n)
			return;
		System.out.print(k+"  ");
		message(n, k+1);
	}

}
