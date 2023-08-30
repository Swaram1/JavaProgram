package Arrays;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] u= new int[] {1,3,4,5,6,2};
		System.out.println("elements at odd position");
		for(int i=0;i<u.length;i=i+2) {
			System.out.println(u[i]);
			
		}
		System.out.println("elements at even position");
		for(int i=1;i<u.length;i=i+2) {
			System.out.println(u[i]);
		}
	}

}
