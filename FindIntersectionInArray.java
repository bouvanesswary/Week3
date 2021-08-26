package week3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		int[] arr = { 3, 2, 11, 4, 6, 7 };// Declare An array for {3,2,11,4,6,7};
		int[] arr1 = { 1, 2, 8, 4, 9, 7 };// b) Declare another array for {1,2,8,4,9,7};
		
				List<Integer> first=new ArrayList<Integer>(arr.length);
				List<Integer> sec=new ArrayList<Integer>(arr1.length);
		
		for(int i:arr)
		{
			first.add(i);
		}
		System.out.println(first);
		
		for(int i:arr1)
		{
			sec.add(i);
		}
		System.out.println(sec);
		
		first.retainAll(sec);
		sec.retainAll(first);
		
		System.out.println("Intersection Values"+first);
		System.out.println("Intersection Values"+sec);

		
		
		
		
		
		
		
		
		
		//Array:
		
		/*
		first: for (int i = 0; i < arr.length - 1; i++)// Declare for loop iterator from 0 to array length
		{
			second: for (int j = 0; j < arr1.length - 1; j++)// Declare a nested for another array from 0 to array
																// length
			{

				if (arr[i] == arr1[j])// Compare Both the arrays using a condition statement
				{
					// Print the first array (should match item in both arrays)
					System.out.println(arr[i]);
					break first;

				}
				*/

			}


		

	

}
