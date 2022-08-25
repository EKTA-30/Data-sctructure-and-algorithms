package recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		combinatios("", "18");
		System.out.println(combinatiosList("", "12"));
		System.out.println(combinatiosCount("", "12"));
	}
	static void combinatios(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit = up.charAt(0) - '0';
		for(int i=(digit-1)*3 ; i<digit*3 ; i++) {
			char ch = (char)('a'+i);
			combinatios(p+ch, up.substring(1));
		}
	}
	static int combinatiosCount(String p,String up) {
		if (up.isEmpty()) {
			return 1;
		}
		int  count=0;
		int digit = up.charAt(0) - '0';
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch = (char)('a'+i);
		count = count +	combinatiosCount(p+ch, up.substring(1));
		}
		return count;
	}
	
	static List<String> combinatiosList(String p,String up) {
		if (up.isEmpty()) {
			List <String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		List <String> list = new ArrayList<>();
		int digit = up.charAt(0) - '0';
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch = (char)('a'+i);
			list.addAll(combinatiosList(p+ch, up.substring(1)));
		}
		return list;
	}

}
