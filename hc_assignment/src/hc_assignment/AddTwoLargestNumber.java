package hc_assignment;

public class AddTwoLargestNumber {
	
	public static long convertToInt(String str)
	{
		long num=0;
		for(char ch : str.toCharArray())
		{
			num=num*10+ch-'0';
		}
		System.out.println(num);
		return num;
	}
	
	public static String AddNumber(String str1,String str2)
	{
		int max=0;
		if(str1.length()>str2.length())
		{
			max=str1.length()-str2.length();
		}
		else {
			max=str2.length()-str1.length();
		}
		String str="";
		for(int i=0 ; i<max ; i++)
		{
			str+='0';
		}
		if(str1.length()>str2.length())
		{
			String s = str.concat(str2);
			str2=s;
		}
		else {
			String s = str.concat(str1);
			str1=s;
		}
		
		str="";
		int charry = 0;
		for(int i=str1.length()-1;i>=0;i--)
		{
			int num = str1.charAt(i)-'0'+str2.charAt(i)-'0'+charry;
			int n = num%10;
			str+=n;
			charry = num/10;
			
		}
		if(charry>0)
		{
			str+=charry;
		}
		String x= "";
		for(int i=str.length()-1 ; i>=0 ;i--)
		{
			x+=str.charAt(i);
		}
		return x;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "9876543210000000000000000000000000";
		String str2 = "1234567890000000000";
		Long num=0l;
		try {
			 num = Long.parseLong(AddNumber(str1,str2));
		}
		catch(Exception e)
		{
			System.out.println("Cant convert to long out of ranage");
		}
		
		System.out.println(num);
	}

}
