package xyzpackage;

public class monze3 {
	public static void main(String[] args) {
		try {
			monze3.divide(100, 10);
		} // Jumps to #2
		finally{
			System.out.println("finally in main #1");
		}
	}	
	public static void divide(int n, int div){
		try    {   int ans = n/div; }
		finally{
			System.out.println("finally of divide #2");
		}
	}
}