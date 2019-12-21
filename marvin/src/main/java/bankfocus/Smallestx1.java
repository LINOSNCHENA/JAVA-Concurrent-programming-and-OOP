package bankfocus;
public class Smallestx1 
{
	public static void main(String[] args) 
	{
	 int[] a = {1984, 2019, 2009, 2004, 2020};
		int temp;  
		
     for (int i = 0; i < a.length; i++) 		 {  
		 for (int j = i + 1; j < a.length; j++)   
		 {  
			 if (a[i] < a[j])   
			 { 	 temp = a[i];  
				 a[i] = a[j];  
				 a[j] = temp;   }  
			 }  
		 }  
	 System.out.print("\nSecondlargest number is:" + a[1]);
	  // 2nd element because index starts from 0 
	 System.out.print("\nFirst largest number is:" + a[0]);
	 //  1st element because index starts from 0  
	
	} 
}
