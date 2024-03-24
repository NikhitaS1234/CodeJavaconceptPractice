
public class trycatchexceptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=9;
		int c=0;
		int b[]= {1,2,3};

		try
		{  
			//int b[]= {1,2,3};
			int k=a/c;
			System.out.println(k);
			//System.out.println(b[3]);

		}
		catch(ArithmeticException et)
		{
			System.out.println("I catched Arithmetic error/exception");


		}
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I catched Indexout of bound error/exception");

		}
		
		finally
		{
			System.out.println("cookies deleted");
		}
		
	}

}
