package bankfocus;
public class Smallestx2 {  
	public static void main(String[] args) {
		int arr[] = { 8,809, 12, 194, 209, 214, 66,3,424 };
		int d=arr.length;
		int largest = arr[0];
		int secondLargest = arr[0];	
		System.out.println("============================= START =================");	
		System.out.println("The last six humidity readings are:" );
		for (int i = 0; i < arr.length; i++) 
		{	System.out.print(arr[i]+"\t");	
			System.out.print(arr[i]+"\n");
		}	
		// System.out.println("============================= START =================");
		for (int i = 0; i < d; i++) {
 			if (arr[i] > largest && arr[i] > secondLargest) {
				secondLargest = largest;  // yes, the largest is demoted second
				largest = arr[i];          // trial becomes number one
			 }
			 else if (arr[i] > secondLargest) { // Second competition
				secondLargest = arr[i];     //yes is further demoted to third!
 			}
		}
	
        System.out.print("\nFirst largest unit is:" + largest);
		System.out.println("\nSecond largest unit is:" + secondLargest);
		System.out.println("========================= SUMMARY =====================");
			System.out.print("\nFirst measurment is:" + arr[0]);
	    	// 2nd element because index starts from 0 
	        System.out.print("\nLast measurment is:" + arr[d-1]+"\n");
	      //  1st element because index starts from 0  
	     System.out.println("========================= END =======================");
 	}
}
//	1-2-3
// cd C:\Users\linos\Downloads\brno\src\main\java
// javac Smallestx2.java
// java Smallestx2 
