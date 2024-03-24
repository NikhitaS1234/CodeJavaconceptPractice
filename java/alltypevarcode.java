
public class alltypevarcode {
	
	String name;//instance variable
	String address;//instance variable
	String city="Dharwad";
	 int i=0;
	
	public alltypevarcode(String name, String address)
	{
	    System.out.println(address+" "+ city +" "+name);
	  // this.city=city;
	    i++;
	    System.out.println(i);

	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alltypevarcode vc=new alltypevarcode("Dhanesh","mp");
		alltypevarcode vc2=new alltypevarcode("Nikhita","mp");

		
	}
	
	

}
