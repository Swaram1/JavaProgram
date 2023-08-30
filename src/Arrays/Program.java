package Arrays;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] u= new int[] {1,3,4,5,6,2};
		int[] u1= new int[u.length];
		int left=0;
		  int right=u.length-1;
		Arrays.sort(u);
		for(int i=0;i<u.length;i++) {
		System.out.println(u[i]);
		}
		for(int i=0;i<u.length;i++) {
			if(u[i]%2==0) {
				u1[i]=u[i];
				System.out.println(u1[i]);
		}
			}
		for(int i=0;i<u.length;i++) {
			
		}
		}
	}



