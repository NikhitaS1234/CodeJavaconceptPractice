
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {3,5,6,1,2,7};
		 int temp;
		 int j=0;
		for(int i=0;i<=5;i++)
		{
			for( j=i+1;j<=5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<=5;k++)
		{
			System.out.println(a[k]);
		}
		//System.out.println(a[j]);


		

	}

}
