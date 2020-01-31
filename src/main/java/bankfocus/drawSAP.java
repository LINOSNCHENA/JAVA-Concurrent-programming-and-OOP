package bankfocus;

public class drawSAP {

	public static void main(String[] args) 
{
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5 - i; j++) 
		{	System.out.print(" * ");		} //Starts from 5/ Half
		for (int k = 0; k <= i;    k++)   
		{	System.out.print(" 1 ");		}  //starts from 0
		System.out.println();
	}
}
}