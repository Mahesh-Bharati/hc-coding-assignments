package abstraction;

class Animal{
	String name;
	public void displayName(String name)
	{
		this.name=name;
		System.out.println(name+" in Animal");
	}
	
}
class Dog extends Animal{
	String name;
	public void displayName(String name)
	{
		this.name=name;
		System.out.println(name +" in dog");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d = new Animal();
		d.name="chamya";
		d.displayName(d.name);
		String str = "My name is mahesh";
		String[] arr = str.split(" ");
		for(String str1 : arr)
		{
			System.out.println(str1);
		}
			
	}

}
