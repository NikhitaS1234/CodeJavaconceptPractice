
public class Maxnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,3,7 },{8,9,1},{3,5,0}};
	int minimum=0;
	int minimumcol = 0;
		//2 3 5
		//8 9 0
		//3 5 7
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(a[i][j]);
				 System.out.print(" ");
				 
				 if(a[i][j]<a[0][0])
				 {
					 minimum=a[i][j];
					 minimumcol=j;//2-minimumcolumn
				 }
				
			 } 
			 System.out.print("\n");

			 
		 }
		
		 System.out.print(minimum);

		 int max=a[0][minimumcol];
		 int k=0;
		 while(k<3)//using while loop to check when it will catch the max number
		 {
			 if(a[k][minimumcol]>max)
			 {
				 max=a[k][minimumcol];
			 }
			 k++;
		 }
		 System.out.println(max);


	}



}
