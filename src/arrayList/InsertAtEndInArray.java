package arrayList;

import java.util.Arrays;

public class InsertAtEndInArray {

	public static void main(String[] args) {
		int [] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int pos = 5;
		int n = 5;
		int newvalue = 9 ;
		for(int i =0 ;i < n ;i++)
		{
			System.out.print(arr[i] + " ");
		
		}
		System.out.println(" ");
		
		for(int i = arr.length-1;i>pos;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos] = newvalue;
		for(int i = 0 ;i < n+1 ;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	
	

}
