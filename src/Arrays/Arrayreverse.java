package Arrays;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s= new int[] {1,2,3,4,5};
		System.out.println("original array");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("Reversed array");
		for(int i=s.length-1;i>=0;i--) {
			System.out.println(s[i]);
		}
	}

}
