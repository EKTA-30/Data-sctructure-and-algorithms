package strings;

import java.util.ArrayList;
import java.util.List;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
//		subsequence("", str);
		subsequenceWithASCII("", str);
//		System.out.println(subsequenceList("", str));
		System.out.println(subsequenceListWithASCII("", str));
	}
	public static void subsequence(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		char ch = unprocessed.charAt(0);
		//include the current character
			subsequence(processed+ch , unprocessed.substring(1));
		//do no include the current character
		subsequence(processed, unprocessed.substring(1));
	}
	public static void subsequenceWithASCII(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		char ch = unprocessed.charAt(0);
		//include the current character
		subsequenceWithASCII(processed+ch , unprocessed.substring(1));
		//do no include the current character
		subsequenceWithASCII(processed, unprocessed.substring(1));
		//include the character as ASCII value
		subsequenceWithASCII(processed + (ch+0), unprocessed.substring(1));
	}
	
	public static ArrayList<String> subsequenceList(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(processed);
			return list;
		}
		char ch = unprocessed.charAt(0);
		
		//include the current character, that is the left subtree of recursion every time
			ArrayList<String > left = subsequenceList(processed+ch , unprocessed.substring(1));
		//do no include the current character, that is the right subtree of the recursion tree every time
			ArrayList<String> right = subsequenceList(processed , unprocessed.substring(1));
			
			left.addAll(right);
			return left;
	}
	public static ArrayList<String> subsequenceListWithASCII(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(processed);
			return list;
		}
		char ch = unprocessed.charAt(0);
		
		//include the current character, that is the left subtree of recursion every time
			ArrayList<String > first = subsequenceListWithASCII(processed+ch , unprocessed.substring(1));
		//do no include the current character, that is the right subtree of the recursion tree every time
			ArrayList<String> second = subsequenceListWithASCII(processed , unprocessed.substring(1));
		//include the character as ASCII value
			ArrayList<String> third = subsequenceListWithASCII(processed + (ch+0) , unprocessed.substring(1));
			first.addAll(second);
			first.addAll(third);
			return first;
	}
}
