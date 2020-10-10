package muntu4;

public class reverseName {

	public static void main(String[] args) {
		String str1 = "Leon";
		String str2 = "Lorena";
		String str3 = "Nikolas";
		int i3 = str3.length();
		int i2 = str2.length();
		int i1 = str1.length();
		int i4=i1+i2+i3;
		System.out.println("\n =========================== START ===============================\n");
		System.out.println("Original     : " + str1 + " ! " + str2 + " ! " + str3);
		System.out.println("Total Length : " + i4);
		System.out.println("");

		StringBuffer m1 = new StringBuffer(str1); 	// version #1
		System.out.println(m1.reverse());

		for (; i2 > 0; --i2) 						// version #2
		{
			System.out.print(str2.charAt(i2 - 1));
		}
		System.out.println("");

		while (i3 > 0)								 // version #3
		{
			System.out.print(str3.charAt(i3 - 1));
			i3--;
		}
		System.out.println("\n =========================== END ===============================\n");
	}
}