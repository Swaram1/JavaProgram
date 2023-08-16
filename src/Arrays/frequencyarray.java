package Arrays;

public class frequencyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int[] freq=new int[arr1.length];
		int visit =-1;
		
		for(int i=0;i<arr1.length;i++) {
			int count=1;
			for(int j=i+1; j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
					freq[j]=visit;
				}		
			}
					if(freq[i]!=visit) 
						 freq[i] = count; 
					}
		for(int i=0;i<arr1.length;i++) {
			if(freq[i]!=visit)
			System.out.println("    " + arr1[i] + "    |    " + freq[i]); 
		}
		
	}

}
