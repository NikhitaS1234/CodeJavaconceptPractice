
public class Multidimarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,8,0},{4,9,7},{7,8,1}};
	   int min=a[0][0];
	   int mincolumn = 0;
		
		//2 3 4
		//4 9 6
		//7 8 0
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			//	System.out.print(a[i][j]);
			//	System.out.print(" ");
				
				if(a[i][j]<min)//2<0,4<0,7<0
				{
					min=a[i][j];//0
				 mincolumn=j;//column 1		
        		}	

			}			

			
	 	
		//System.out.println(min +"is small number");
		}
		int max=a[0][mincolumn];//a[0][1]
		int k=0;
		while(k<3)//0<3
		{
		if(a[k][mincolumn]>max)
		{
			max=a[k][mincolumn];
		}
		k++;
		
		
		}
		System.out.println(max);
	

	}

	
}

	

