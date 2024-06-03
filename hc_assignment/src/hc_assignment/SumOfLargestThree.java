package hc_assignment;

import java.util.Scanner;

public class SumOfLargestThree {

	public static int[] arraySort(int []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the "+i+"th Element");
			arr[i]=sc.nextInt();
		}
		int []arr1 = arraySort(arr);
		int num = arr1[0]+arr1[1]+arr[2];
		System.out.println("Sum of largest three number is "+num);
		sc.close();
	}

}
