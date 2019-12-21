package bankfocus;

public class drawPyramidPattern {

	public static void main(String[] args) 
{
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5 - i; j++) {	System.out.print("5");		} //Starts from 5/ Half
		for (int k = 0; k <= i;    k++)    {	System.out.print("0 ");		}  //starts from 0
		System.out.println();
	}
}
}