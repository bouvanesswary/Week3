package week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		
		Arrays.sort(data);
		
		List<Integer> datalist=new ArrayList<Integer>();
	for(int i:data)
	{
		datalist.add(i);
	}
	
	Collections.sort(datalist);
	System.out.println(datalist);

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */
		
	
		System.out.println(data[data.length-2]);
	}

}
