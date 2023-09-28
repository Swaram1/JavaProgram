package Search;

public class Linearsearch {
	
	public static int linearsearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5};
		int key=5;
		int out=linearsearch(arr,key);
		System.out.println(out);
	}

}
