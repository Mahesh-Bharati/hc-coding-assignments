package hc_assignment;

import java.util.Scanner;


public class StringToInt {
	
	public static int convertStringToInt(String str)
	{
		char []arr=str.toCharArray();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			try {
				if(arr[i]>='0' && arr[i]<='9')
				{
					sum=sum*10+(int)arr[i]-(int)'0';
					
				}
				else {
					String Str = "please Enter numeric String";
					NumericStringException exception = new NumericStringException(Str);
					System.out.println(exception.getException());
					return 0;
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the numeric String");
		String str = sc.next();
		int num = convertStringToInt(str);
		System.out.println(num);
		sc.close();
		
	}

}
