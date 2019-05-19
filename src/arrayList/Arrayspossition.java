package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayspossition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length");
		int n=sc.nextInt();    
		System.out.println("Enter rotations");
		int d=sc.nextInt();  
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter elements");
			int x=sc.nextInt();
			a[(i-d+n)%n] = x;
		}
		System.out.println("Array after left rotation");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	
	}
	

}
