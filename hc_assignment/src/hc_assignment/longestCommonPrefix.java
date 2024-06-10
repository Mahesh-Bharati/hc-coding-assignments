package hc_assignment;



public class longestCommonPrefix {
	
	public static int minLength(String[] arr)
	{
		int min = arr[0].length();
		for(int i=0 ; i<arr.length ; i++)
		{
			if(min>arr[i].length())
			{
				min=arr[i].length();
			}
		}
		return min;
	}
	
	public static String commonPrefix(String[] arr)
	{
		int min= minLength(arr);
		StringBuilder br = new StringBuilder("");
		String str = arr[0];
		for(int i=0 ; i<min ; i++)
		{
			for(int j=0 ; j<arr.length ; j++)
			{
				if(str.charAt(i)!=arr[j].charAt(i))
				{
					String str1=br.toString();
					return str1;
				}
			}
			br.append(str.charAt(i));
		}
		str = br.toString();
		
		return str;
	}

	public static void main(String[] args) {
		
		String []arr = {"flower","flow","flight"};
		String str = commonPrefix(arr);
		System.out.println(str);
	}

}
