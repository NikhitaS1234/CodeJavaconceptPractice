import java.text.SimpleDateFormat;
import java.util.Date;

public class dateclass {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		System.out.println(  sdf.format(d)	)	;
		System.out.println(  sd.format(d)	)	;

		
	}

}
