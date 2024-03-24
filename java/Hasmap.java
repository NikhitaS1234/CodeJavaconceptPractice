import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashmap collection used to store key value pair data and the values can be accessd
		//using the key used to store 
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Nikhita");
		hm.put(1, "Dhanesh");
		
		System.out.println(hm.get(0));
		Set sn=hm.entrySet();
		
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();//separates key and value
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		
		
		

	}

}
