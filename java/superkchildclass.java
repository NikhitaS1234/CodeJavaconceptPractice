
public class superkchildclass  extends superkeyword{
	String n="Dhanesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superkchildclass sc=new superkchildclass();
		sc.getData();
	
	}
	
	public superkchildclass()
	{
		//super();
		System.out.println("in child class");

	}
	
	
	public void getData()
	{

		//System.out.println("in child class");
		System.out.println(n);
	    System.out.println(super.n);
	    super.sendData();

	}

}
