
public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading mo= new methodOverloading();
		mo.data(2);
		mo.data('a');

		
		
	}
	
	public void data(int a) 
	{
		System.out.println(a);
	}
	
	public void data(char e)
	{
		System.out.println(e);

	}
	

}
