package arrays;
import java.util.*;
public class MissingRepeatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		System.out.println(repeatedNumber(list));
 
	}
	 public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	        ArrayList <Integer> list = new ArrayList<>();
	        int repeat =0,missing=0;
	        int i=0, n= A.size();
	        int sum = 0,naturalSum =0;
	        for(int j=0;j<n;j++)
	        	sum+=A.get(j);
	        naturalSum = (n*(n+1))/2;
	        while(i<n) {
	        	if(!A.contains(i+1)) {
	        		missing = i+1;
	        		break;
	        	}
	        	i++;
	        }
	        repeat = sum + missing - naturalSum;
	        list.add(repeat);
	        list.add(missing);
	        return list;
	    }
}
