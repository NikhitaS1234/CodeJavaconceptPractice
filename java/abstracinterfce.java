
public class abstracinterfce extends Abstrcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstracinterfce ac=new abstracinterfce();
	ac.bodycolor();
	ac.brek();
	ac.accelerator();
		
	}
	public void brek()
	{
		System.out.println("child methhod");

	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("body color is red");

		
	}

}
