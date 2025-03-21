package day__1;

import java.util.*;
public class reverse_ {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n =sc.nextInt();
		int[] arr=new int[n];
		System.out.println("ENTER THE ELEMENTS");
		for (int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for (int i=0,j=n-1;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	

}