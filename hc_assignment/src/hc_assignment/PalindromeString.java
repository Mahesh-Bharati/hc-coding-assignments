package hc_assignment;

import java.util.Scanner;

public class PalindromeString {
	
	public static boolean checkPalindrome(String str)
	{
		boolean flag=true;
		int n=0;
		int m = str.length()-1;
		while(n<m)
		{
			if(str.charAt(n)!=str.charAt(m))
			{
				flag=false;
				return flag;
			}
			n++;
			m--;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str = sc.next();
		if(checkPalindrome(str))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		sc.close();
		
	}

}
