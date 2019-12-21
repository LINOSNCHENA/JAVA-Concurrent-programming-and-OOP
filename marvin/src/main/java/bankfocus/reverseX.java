package bankfocus;

public class reverseX {

	public static void main(String[] args) {
	String str1="Leon"; 	
	String str2="Lorena"; 	int i2 = str2.length();
	String str3="Nikolas"; 	int i3 = str3.length();

	StringBuffer m1 = new StringBuffer(str1);	    // version #1
	System.out.println(m1.reverse());	
	
	for (; i2 > 0 ; --i2)		                     // version #2
	{ System.out.print(str2.charAt(i2-1));  }
	System.out.println("");

	while(i3>0)										 // version #3
	{	System.out.print(str3.charAt(i3-1)); i3--;}
	}
}