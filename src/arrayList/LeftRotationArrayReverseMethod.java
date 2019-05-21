package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotationArrayReverseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		System.out.println("Array becomes : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Required pos :");
		int d = sc.nextInt();
		d = d % n;
		leftRotate(arr, d);
		printArray(arr);

	}

	static void leftRotate(int arr[], int d) {
		int n = arr.length;
		rvereseArray(arr, 0, d - 1);
		rvereseArray(arr, d, n - 1);
		rvereseArray(arr, 0, n - 1);
	}

	static void rvereseArray(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
