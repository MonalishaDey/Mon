package arrayList;

public class DeleteElement {

	public static void main(String[] args) {
		int []arr = {10,30,50,20,60};
		int pos = 3;
		int i ;
		for( i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		for( i=pos;i<arr.length-1;i++ )
		{
			arr[i] = arr[i+1];
		}
		for(i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}


}
