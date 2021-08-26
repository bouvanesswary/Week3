package week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

			List<Integer> arr1=new ArrayList<Integer>();
			
		// get the length of the array
		
		
		// declare an int variable named count
		int count;
		for(int i:arr)
		{
			arr1.add(i);
		}
		
		System.out.println(arr1);
		
		Set<Integer> setarr=new HashSet<Integer>();
		
		for(int i=0;i<arr1.size();i++)
		{
			//count=0;// assign 0 to count
			// iterate from i to the length of the array by adding 1 to it (inner loop
			// starts here)
			for (int k = i + 1;k < arr1.size();k++)
			{
				// compare both the loop variables & check they're equal
				if(arr1.get(i)==arr1.get(k))
				{
					
					setarr.add(arr1.get(i));
					//System.out.println(setarr);
				}
			
				
			}
		}
		System.out.println(setarr);
		arr1.removeAll(setarr);
		
		System.out.println(arr1);
		
	}
}


		
		

		

	

