import java.util.ArrayList;

public class StreamsNamestartswith {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Nikhita");
		al.add("Nimmi");
		al.add("Neha");
		al.add("Danesh");
		int count = 0;
		for(int i=0;i<al.size();i++)
		{
			//int count = 0;
			String actual=al.get(i);
			if(actual.startsWith("N"))
			{
				count++;
			}
		}
		System.out.println(count);
			
		}

	}


