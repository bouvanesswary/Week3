package week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 7, 6, 8 };
		
		List<Integer> miss=new ArrayList<Integer>();

		// Sort the array
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		for(int i:arr)
		{
			miss.add(i);//add index and value
		}
		
			for(int i=0;i<miss.size();i++)//iterate 0 to less then arr value
			{
			if(miss.get(i)!=i+1)//if (0!=0+1) 
			{
				System.out.println(i+1);//(0+1)
				break;
			}
		}
		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

	}

}
