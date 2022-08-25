package recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diceList("", 4));
		dice("", 4);

	}
	
	static List<String> diceList (String processed,int target){
		if(target == 0) {
			List<String> list = new ArrayList<>();
			list.add(processed);
			return list;
		}
		List <String> list = new ArrayList<>();
		for(int i=1;i<=6 && i<=target;i++) {
			list.addAll(diceList(processed+i, target-i));
		}
		return list;
	}
	
	static void dice(String processed,int target) {
		if(target == 0) {
			System.out.print(processed+"   ");
			return;
		}
		for(int i=1;i<=6 && i<=target;i++) {
			dice(processed+i, target-i);
		}
	}

}
