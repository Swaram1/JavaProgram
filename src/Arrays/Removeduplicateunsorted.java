package Arrays;

import java.util.Arrays;

public class Removeduplicateunsorted {
	public static int Removeduplicateunsorted(int arr[],int n) {
		if(n==0||n==1) {
		return n;
		}
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,3,2,3,5,3,4};
		Arrays.sort(arr);
		int length=arr.length;
		length=Removeduplicateunsorted(arr,length);
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
	}

}
