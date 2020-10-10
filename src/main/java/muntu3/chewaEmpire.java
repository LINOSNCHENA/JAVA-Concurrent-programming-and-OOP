package muntu3;

class Singleton {
	private static Singleton rulingFamily = null;
	// Naming of the leader of the Ruling Family
	public String dynasticName;

	private Singleton() {
		dynasticName = "Chewa Royal Family";
	}

	// Create a family only when a family has never been created
	public static Singleton getInstance() {
		if (rulingFamily == null) {
			rulingFamily = new Singleton();
		}
		return rulingFamily;
	}
}

class Main {
	public static void main(String args[]) {
		System.out.println("\n ===================================================================");
		// Succession of Leaders in ruling family

		Singleton head1 = Singleton.getInstance();
		Singleton head2 = Singleton.getInstance();
		Singleton head3 = Singleton.getInstance();
		// change Leader One while maintaining ruling family
		head1.dynasticName = (head1.dynasticName).toUpperCase();
		System.out.println("\n");
		System.out.println("Nikolas is CEO of " + head1.dynasticName);
		System.out.println("LorenaN is CEO of " + head2.dynasticName);
		System.out.println("Leon cN is CEO of " + head3.dynasticName);
		System.out.println("\n");
		// change Leader One while maintaining ruling family
		// Take note changing Big to small latest is passed on to successfull leaders
		head3.dynasticName = (head3.dynasticName).toLowerCase();
		System.out.println("Nikolas is King of " + head1.dynasticName);
		System.out.println("Lorena is Queen of " + head2.dynasticName);
		System.out.println("Leon cN is King of " + head3.dynasticName);
		System.out.println("\n ===================================================================");
	}
}
