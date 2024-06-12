package hc_assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentWordInString {
	
	public static String mostFrequentWord(String str)
	{
		List<String> list = new ArrayList<>();
		int n=0;
		
		for(int i=0 ; i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				list.add(str.substring(n, i));
				n=i+1;
			}
		}
		list.add(str.substring(n));
		Map<String , Integer> map = new HashMap<String,Integer>();
		int max=1;
		for(int i=0 ; i<list.size();i++)
		{
			if(map.containsKey(list.get(i)))
			{
				int m = map.get(list.get(i));
				m=m+1;
				
				map.put(list.get(i), m);
				if(m>max)
				{
					max=m;
				}
			}
			else {
				map.put(list.get(i), 1);
			}
		}
		String s =  "";
		//System.out.print(max);
		for(Map.Entry<String, Integer> set : map.entrySet())
		{
			if(set.getValue()==max)
			{
				s=set.getKey();
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the quick brown fox jumps over the lazy dog the quick quick dog mahesh";
		String s = mostFrequentWord(str);
		System.out.print(s);
	}

}
