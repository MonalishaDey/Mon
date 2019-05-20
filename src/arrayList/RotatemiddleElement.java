package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class RotatemiddleElement {

	public static void main(String[] args) {
		/*
		 * int [] arr = {1,2,3,4,5}; int x = arr[(arr.length)/2]; System.out.println(x);
		 * for(int i = (arr.length)/2;i>0;i--) { arr[i] = arr[i-1]; } arr[0] = x;
		 * System.out.println(Arrays.toString(arr));
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length :");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements :");

		for (int i = 0; i < arr.length; i++) {

			int x = sc.nextInt();
			arr[i] = x;

		}
		System.out.println("Create an array :");

		System.out.println(Arrays.toString(arr));
		int mid = arr[(arr.length)/2];
		System.out.println("mid = "+mid);
		for(int i = (arr.length)/2;i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = mid; 
		System.out.println("After middle becomes 1st element");
		System.out.println(Arrays.toString(arr));
		
	}

}
