
public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBuffer is a class where value of any existing string can be altered
		//String s="Nikhita";
		StringBuffer sb=new StringBuffer("Nikhita");
		sb.append("Dhanesh");
		System.out.println(sb);//NikhitaDhanesh
		sb.insert(7, "heart");
		System.out.println(sb);//NikhitaheartDhanesh
		sb.replace(7, 12, "lllll");
		System.out.println(sb);//NikhitalllllDhanesh
		sb.deleteCharAt(11);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("hi");
		sb1.append("Dhanesh");
		System.out.println(sb1);

	}

}
