package muntu4;

public class remaindRSap {
	public static void main(String[] args) {
		int endx = 9;
		System.out.println("\n ============== Compare to Print =========================");
		for (int i = 1; i < endx; i++) {
			if (i % 3 == 0) {
				System.out.println("fizz");
			}
			if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
		System.out.println("\n ================== compare ChartAt ======================");
		String pemba = "ABCXYZ";
		String monze = "ZYZCBA";
		int z = pemba.length() - 1;
		for (int i = 0; i < z; i++) {
			if (pemba.charAt(i) == monze.charAt(z - i)) {
				System.out.println("-TRUE-");
			} else {
				System.out.print(pemba.charAt(i));
				System.out.print("-FALSE-");
				System.out.println(monze.charAt(z - i));
			}
		}
		System.out.println("======================== End ============================");
	}
}