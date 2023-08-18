package Arrays;

public class minarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,23,45,67,0};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
	}
}
