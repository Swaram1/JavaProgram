package Arrays;

public class Printduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int[]{1,2,3,3,4,5,1};
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j])
					System.out.println(arr1[j]);
			}
		}
	}

}
