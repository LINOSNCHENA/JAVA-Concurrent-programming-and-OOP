package muntu2;

public class FinallyFinal {
	public static void main(String[] args) {
		try {
			FinallyFinal.divide(100, 0);
		} // Jumps to #2
		finally{
			System.out.println("finally in main #1");
		}
	}	
	public static void divide(int n, int div){
		try    {   int childParent = n/div; 	System.out.println( childParent);}
		finally{
			System.out.println("finally of divide #2");
		}
	}
}