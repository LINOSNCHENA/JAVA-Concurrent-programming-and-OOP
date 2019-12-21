package bankfocus;
public class Smallestx1 
{
	public static void main(String[] args) 
	{
	 int[] a = {1984, 2019, 2009, 2004, 33, 66,2020,4};
	 int d=a.length;
		int temp;  
		
     for (int i = 0; i < d; i++) 		 {  
		 for (int j = i + 1; j < d; j++)   
		 {  
			 if (a[i] < a[j])   
			 { 	 temp = a[i];  
				 a[i] = a[j];  
				 a[j] = temp;   }  
			 }  
		 }  
	System.out.println("============================ STARTx1 =====================");
	System.out.print("\nSecondlargest number is:" + a[1]+"\n");
	  // 2nd element because index starts from 0 
	System.out.print("\nFirst largest number is:" + a[0]+"\n");
	 //  1st element because index starts from 0  
	 System.out.print("\nThe smallest number is:" + a[d-1]+"\n");
	System.out.println("=============================== ENDx2 =====================");
	
	} 
}
