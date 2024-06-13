package hc_assignment;

import java.util.Scanner;

public class _2dArray {
	
	public static boolean findNumber(int num)
	{
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				if(num==arr[i][j])
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the targeted element");
		int num =sc.nextInt();
		boolean check = findNumber(num);
		System.out.println(check);
		sc.close();

	}

}
