import java.util.ArrayList;

public class Uniquenumuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[]= {2,3,6,7,2,3,1,3,6,7};
		
		 
		 ArrayList al=new ArrayList();//empty array list 
		 
		 for(int i=0;i<a.length;i++)
		 {
			 int k=0;
			if(!al.contains(a[i]))//if arraylist does not contains a[i] then go inside loop
			{
				al.add(a[i]);//push number into arraylist 2
				k++;
				
				for(int j=i+1;j<a.length;j++)//scans from next number 4
				{
					if(a[i]==a[j])
					{
						k++;
					
				    }
					
			    }
//				System.out.println(a[i]);
//				System.out.println(k);
				if (k==1)
				{
					System.out.print(a[i] + " "+" is Unique number");

				}
				
		    }

			

		 
		 
		 
		 
	}
	}
}

