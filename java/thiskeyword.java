
public class thiskeyword {
	
	
	int a=9;
	public  void getData() {
		// TODO Auto-generated method stub
		int a=8;
		int c=a+this.a;
		System.out.println(a);//8
		System.out.println(this.a);//9
		System.out.println(c);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thiskeyword tk=new thiskeyword();
		tk.getData();
		
		
	}

	

}
