package hc_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateBracketString {
	
	public static boolean checkBracketString(String str)
	{
		boolean flag=true;
		List<Character> list = new ArrayList<>(); 
		for(int i=0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
			{
				list.add(str.charAt(i));
				//System.out.println(str.charAt(i));
			}
			else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']')
			{
				int l = list.size();
				char ch = list.get(l-1);
				if(ch=='(' && str.charAt(i)==')')
				{
					list.remove(l-1);
				}
				else if(ch=='{' && str.charAt(i)=='}')
				{
					list.remove(l-1);
				}
				else if(ch=='[' && str.charAt(i)==']')
				{
					list.remove(l-1);
				}
				else {
					flag=false;
					return flag;
				}
			}
			else {
				continue;
			}
		}
		if(!list.isEmpty())
		{
			flag=false;
			return flag;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string");
		String str=sc.next();
		boolean checkString = checkBracketString(str);
		System.out.println(checkString);
		sc.close();
		
	}

}
