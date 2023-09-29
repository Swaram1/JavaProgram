package Arrays;

import java.util.Arrays;

public class oddevensort {
 
    
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        
       
        int array[] = { 1,2,3,4,5 };
 
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
     
        int j = 0, k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
        }
        Arrays.sort(even);
    	Arrays.sort(odd);
        
    	 for (int num : even) {
             System.out.print(num + " ");
         }
    	 for (int num1 : odd) {
             System.out.print(num1 + " ");
         }
       
        int	sum =even[even.length-2]+odd[odd.length-2];
       

      
    }
}




