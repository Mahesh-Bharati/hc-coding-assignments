package hc_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean checkPalindrom(int number)
	{
		boolean flag=false;
		int num=number;
		int sum=0;
		while(num>0)
		{
			int n = num%10;
			sum=sum*10+n;
			num/=10;
		}
		if(sum==number)
		{
			flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+"th Element");
			arr[i]=sc.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int n : arr)
		{
			if(checkPalindrom(n))
			{
				list.add(n);
			}
		}
		System.out.print("[");
		for(int n : list)
		{
			System.out.print(n+",");
		}
		System.out.print("]");
		sc.close();
		
		
	}

}
