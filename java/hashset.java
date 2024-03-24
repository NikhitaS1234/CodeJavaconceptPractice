import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set= new HashSet();
		set.add("nikhita");
		set.add("Dhanesh");
		set.add("Dhanesh");
		set.add("Nikhita");


	//	set.clear();
		System.out.println(set);
		
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());

		}
		

		

	}

}
