package strings;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		permutations("", "abc");
		System.out.println(permutationsList("", "abcd"));
		System.out.println(permutationsCount("", "abcd"));

	}
	
	static void permutations(String processedString ,String unprocessedString) {
		if(unprocessedString.isEmpty()) {
			System.out.println(processedString);
			return; 
		}
		char ch = unprocessedString.charAt(0);
		for(int i=0;i<=processedString.length();i++) {
			String firstString = processedString.substring(0,i);
			String secondString = processedString.substring(i,processedString.length());
			permutations(firstString+ch+secondString, unprocessedString.substring(1));
		}
	}
	static int permutationsCount(String processedString ,String unprocessedString) {
		if(unprocessedString.isEmpty()) {
			return 1; 
		}
		int count = 0;
		char ch = unprocessedString.charAt(0);
		for(int i=0;i<=processedString.length();i++) {
			String firstString = processedString.substring(0,i);
			String secondString = processedString.substring(i,processedString.length());
			count = count +  permutationsCount(firstString+ch+secondString, unprocessedString.substring(1));
		}
		return count;
	}
	static List<String> permutationsList(String processedString ,String unprocessedString) {
		List<String> result = new ArrayList<>();
		if(unprocessedString.isEmpty()) {
			List<String> list = new ArrayList<>();
			list.add(processedString);
			return list; 
		}//take from unprocessed and 
		char ch = unprocessedString.charAt(0);
		for(int i=0;i<=processedString.length();i++) {
			String firstString = processedString.substring(0,i);
			String secondString = processedString.substring(i,processedString.length());
			//add to processed at multiple positions
			result.addAll( permutationsList(firstString+ch+secondString, unprocessedString.substring(1)));
		}
		return result;
	}
}
