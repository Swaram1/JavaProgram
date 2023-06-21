package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferenceArray {

	public static List<List<Integer>> main(String[] args) {
		// TODO Auto-generated method stub
		//to remove distinct element present in given array
		int[] num1= {1,2,3};
		int[] num2= {2,4,6};
		HashSet<Integer> set1= new HashSet();
		HashSet<Integer> set2= new HashSet();
		for(int ele : num1) {
			set1.add(ele);
		}
		for(int ele:num2) {
			set2.add(ele);
		}
		 List<List<Integer>> list=new ArrayList<>();
	      
	      ArrayList<Integer> l1=new ArrayList<>();
	      
	      ArrayList<Integer> l2=new ArrayList<>();

	     for(int ele:set2){

	         if(set1.contains(ele)==false){
	           l1.add(ele);
	         }
	     }


	       for(int ele:set1){

	         if(set2.contains(ele)==false){
	           l2.add(ele);
	         }
	     }
	       

	       list.add(l2);
	       list.add(l1);
	       return list;
		
	}

}
