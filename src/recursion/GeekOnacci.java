package recursion;

public class GeekOnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(geekOnacci(3, 4, 5, 4));

	}
	
	public static  int geekOnacci(int a,int b, int c,int n) {
		int [] arr = new int[n];
		arr[0] = a;
		arr[1] = b;
		arr[2] =c;
		if(n<3 && n>=0)
			return arr[n];
	for(int i=3;i<n;i++) {
		arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
	}
	return arr[n-1];
	}

}
