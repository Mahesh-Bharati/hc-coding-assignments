package hc_assignment;

import java.util.Scanner;

public class ClimbingStairs {
	
	public static int climbStairs(int n)
	{
		int []arr=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs");
		int stairs=sc.nextInt();
		int n=climbStairs(stairs);
		System.out.println(n);
		sc.close();
	}

}
