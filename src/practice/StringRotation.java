package practice;


public class StringRotation {

	public static void main(String[] args) {
		String s1="abcde";
		String s2="deabc";
		
		if(s1.length()!=s2.length()) {
			System.out.println("no");
		}
		else {
			String s=s1.concat(s1);
			
			if(s.contains(s2)) {
				System.out.println("yes");
			}else
				System.out.println("no");
		}
	}

}
