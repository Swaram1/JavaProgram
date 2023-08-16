package Strings;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Number of character in a string";
		int count = 0;
		for(int i=0; i<S.length();i++) {
			if(S.charAt(i)!=' ') {
				count++;
				
			}
				
		}
		System.out.println(count);
	}

}
