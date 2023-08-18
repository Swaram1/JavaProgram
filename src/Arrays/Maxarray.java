package Arrays;

public class Maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m= new int[] {1,24,15,69,2};
		int max= m[0];
		for(int i=0;i<m.length;i++) {
			if(m[i]>max)
				max=m[i];
		}
		System.out.println(max);
	}

}
