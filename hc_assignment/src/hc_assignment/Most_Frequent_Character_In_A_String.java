package hc_assignment;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Most_Frequent_Character_In_A_String {
	

	public static Character mostFrequentlyChar(String str)
	{
		Map<Character,Integer> test = new TreeMap<Character, Integer>();
		for(char ch : str.toCharArray()) 
		{
			if(test.containsKey(ch)) 
			{
				int n=test.get(ch);
				n++;
				test.put(ch, n);
			}
			else 
			{
				test.put(ch, 1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Character,Integer> entry : test.entrySet())
		{
			list.add(entry.getValue());
		}
		Collections.sort(list);
		int n = list.get(list.size()-1);
		for(Map.Entry<Character, Integer> entry : test.entrySet())
		{
			if(n==entry.getValue())
			{
				return entry.getKey();
			}
		}
		
		return 'a';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		char ch = mostFrequentlyChar(str);
		System.out.println(ch);
		sc.close();
	}

}
