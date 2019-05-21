package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseLeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Print Elements :");
		for(int i =0 ;i< n;i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		System.out.println("Given Array is :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Position Required :");
		int d = sc.nextInt();
		leftRotate(arr,d);
		printArray(arr);
		
	}

	

	static void leftRotate(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);

	}

	 static void reverseArray(int[] arr, int start, int end) {
		 int temp;
		 while(start < end)
		 {
			 temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			 end--;
		 }
		 
	}
	 static void printArray(int[] arr) {
		 for(int i =0 ;i<arr.length;i++)
			 System.out.print(arr[i] + " ");
			
		}

}
