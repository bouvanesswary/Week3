package week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		
		String[] str={"Aspire Systems","HCL","CTS","Wipro"};
		String reverse="";
		List<String> Strarr =new ArrayList<String>(Arrays.asList(str));
		System.out.println(Strarr);
		
		//2.Get the length of the array	
		int strlen=str.length;
		System.out.println(strlen);
		
		//3. sort the array	
		Collections.sort(Strarr);
		System.out.println(Strarr );
		
		//4. Iterate it in the reverse order
		System.out.println("REVERSE STRING");
		System.out.println("------------------");
		for(int i=strlen-1;i>=0;i--)
		{
			String s=Strarr.get(i);
		System.out.println(s);
		}
		//5. print the array
		
		
		//6. Required Output: Wipro, HCL , CTS, Aspire Systems
		
	}



	

}
