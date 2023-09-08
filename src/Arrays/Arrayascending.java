package Arrays;

public class Arrayascending {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {1,3,2,4,6,5};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			}
		 for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        } 
		}
		
	}


