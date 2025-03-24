package search_algorithms;

import java.util.Scanner;

public class search_algorithms {
	public int findMyValue(int a[],int middle,int find,int l,int r )
	{
		int left=l;
		int right=r;
		while(left<=right)
		{
			middle=(left+right) / 2;
			if(a[middle]==find)
			{
				System.out.println("Item found"+a[middle]+"at index of"+middle);
				break;
				}
			else if(find>a[middle])
			{
				left=middle+1;
			}
			else if(find>a[middle])
			{
				right=middle-1;
		}
		}
		return middle;
		}
	public static void main (String[]args) {
		search_algorithms b=new search_algorithms();
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [50];
		System.out.println("Enter any arry size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");}
		System.out.println("Enter your value to find");
		int find=sc.nextInt();
		int left=0;
		int right=size-1;
		int middle=0;
		System.out.println(b.findMyValue(arr, middle, find, left, right));
			
			
		}
	}
		


   