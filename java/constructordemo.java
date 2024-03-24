
public class constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructor executes block of code automatically when object is created
		//constructor does not have return type as methods
		//constructor has same name as class name
		constructordemo cd=new constructordemo();
		constructordemo cd1=new constructordemo(4, 5);

		
	}
	public constructordemo()
	{
	System.out.println("hello constructor");
	}
	
	public constructordemo(int a, int b)//parameterized constructors
	{
	System.out.println("parameterized constructor");
	}
	
}
