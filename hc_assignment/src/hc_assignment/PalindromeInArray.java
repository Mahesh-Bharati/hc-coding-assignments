package hc_assignment;

import java.util.ArrayList;
import java.util.List;

public class PalindromeInArray {
	
	public static boolean isPalindrome(int num)
	{
		int n = num;
		int sum = 0;
		while(n>0)
		{
			int temp = n%10;
			sum = sum*10 + temp;
			n=n/10;
		}
		if(sum==num)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static List<Integer> findPalindrome(int [] arr)
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0 ; i<arr.length ; i++)
		{
			boolean check = isPalindrome(arr[i]);
			if(check)
			{
				list.add(arr[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,454,486,7878,5555};
		List<Integer> list = findPalindrome(arr);
		for(int i=0 ; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
