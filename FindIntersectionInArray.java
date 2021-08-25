package week3.Assignment;

public class FindIntersectionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,2,11,4,6,7};//Declare An array for {3,2,11,4,6,7};	
		int[] arr1={1,2,8,4,9,7};//b) Declare another array for {1,2,8,4,9,7};
		
		first:
		for(int i=0;i<arr.length-1;i++)//Declare for loop iterator from 0 to array length
		{
			second:
			for(int j=0;j<arr1.length-1;j++)//Declare a nested for another array from 0 to array length
			{
				
				if(arr[i]==arr1[j])//Compare Both the arrays using a condition statement
				{
					//Print the first array (should match item in both arrays)
					System.out.println(arr[i]);
					 break first;
				
				}
			
				
			}
			
		}
		
		
		
		
		
		
		
	}

}
