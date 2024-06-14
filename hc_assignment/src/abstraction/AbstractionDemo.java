package abstraction;

interface num{
	public int number(int num);
}
interface div{
	public int divide(int a,int b);
}

abstract class Demp implements num , div{
	public int add(int a, int b) {
		return a+b;
	}
	abstract public int sub(int a,int b);
	public int number(int num)
	{
		return num;
	}
	
}
class Abstract extends Demp{

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public int add (int a , int b)
	{
		return a*b;
	}
	public int divide (int a , int b)
	{
		return a/b;
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstract ab = new Abstract();
		int add = ab.add(5, 5);
		System.out.println(add);
		System.out.println(ab.sub(5, 5));
		System.out.println(ab.number(10));
		System.out.println(ab.divide(10, 2));
		
	}

}
