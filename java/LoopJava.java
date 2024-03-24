import java.util.ArrayList;
import java.util.Arrays;

public class LoopJava {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"Nikhita","Sarole"};
		int[] arr=new int[5];
		int arr1[]= {2,5,6,7,8,9,10};
		arr[0]=1;
		arr[1]=8;
		arr[2]=9;
		arr[3]=4;
		arr[4]=3;
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		for(String s:str)
		{
			System.out.println(s);
		}
		
		for(int j=0;j<arr1.length;j++)
		{
			if(j%2==0)
			{
				System.out.println(arr1[j]+"is even number and multiple of 2");
			}
			else
			{
				System.out.println(arr1[j]+"is odd number and not multiple of 2");
			}
		}
		
	//There is drawback in use of the array as it is fixed way of memory allocation and and 
		//throws index out of bound error whenever code tries to access extra memory
		//so there is class called ArrayList which allocates memory dynamically
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(1, 7);
		al.add(2, 6);
		al.add(0, 0);

		
	
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			}
		
		System.out.println(al.contains(9));
		
		//System.out.println(arr1);
		
	//al=	Arrays.asList(arr);
		for(int d:arr1)
		{
			System.out.println(d);
		}
		String s="Nikhita loves Dhanesh";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(8));
		String[] splsrtring=s.split("loves");
		System.out.println(splsrtring[0]);
		//System.out.println(splsrtring[1]);
		System.out.println( splsrtring[1].trim());

		String[] split2=splsrtring[1].split("n");
		System.out.println(split2[1]);//esh
	//	System.out.println(split2[0]);//Dha
		System.out.println( split2[0].trim());


		
		
	}

}
