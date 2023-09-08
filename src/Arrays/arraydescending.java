package Arrays;

public class arraydescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s= new int[] {1,2,3,4,5,6};
		int temp;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]<s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}	
			}
			
		}	
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("largest element in array is"+" "+s[0]);
	}

}
