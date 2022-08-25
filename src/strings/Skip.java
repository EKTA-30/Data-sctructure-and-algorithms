package strings;

public class Skip{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		skipA("", "baccdah");
		System.out.println(skip_A("baccdah"));
		System.out.println(skipApple("bcdaapplefg"));
		System.out.println(skipApp("badappcdapple"));
		
	}
	public static void skipA(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		if(ch=='a')
			skipA(p,up.substring(1));
		else 
			skipA(p+ch, up.substring(1));
	}
	public static String skip_A(String up) {
		if(up.isEmpty()) {
			return "";
		}
		char ch = up.charAt(0);
		if(ch=='a')
			return skip_A(up.substring(1));
		else 
			return ch + skip_A(up.substring(1));
	}
	public static String skipApple(String up) {
		if(up.isEmpty()) {
			return "";
		}
			if(up.startsWith("apple"))
			return skipApple(up.substring(5));
		else 
			return up.charAt(0) + skipApple(up.substring(1));
	}
	public static String skipApp(String up) {
		if(up.isEmpty())
			return "";
			if(up.startsWith("app") && !up.startsWith("apple"))
				return skipApp(up.substring(3));
					
				
		else 
			return up.charAt(0) + skipApp(up.substring(1));
		
	}

}
