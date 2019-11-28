package singletonesterotype;

class Singleton 
{ 
	// Installation of ruling family after defeating Napolen 
	private static Singleton rulingFamily = null; 

	// Naming of the leader of the Ruling Family
	public String x1Name; 

	// succession of leadeship of the ruling household 
	private Singleton() 	{ x1Name = "Chewa Royal Family"; 	} 


	// Create a family only when a family has never been created
	public static Singleton getInstance() 
	{ if (rulingFamily == null) {rulingFamily = new Singleton(); }		return rulingFamily; 	} 
} 


class Main 
{ 
	public static void main(String args[]) 
	{ 
		// Succession of Leaders in ruling family
		Singleton head1 = Singleton.getInstance(); 
		Singleton head2  = Singleton.getInstance(); 
		Singleton head3 = Singleton.getInstance(); 

	    // change Leader One while maintaining ruling family
		head1.x1Name = (head1 .x1Name).toUpperCase(); 
		System.out.println("Nikolas is CEO of " + head1 .x1Name); 
		System.out.println("LorenaN is CEO of " + head2 .x1Name); 
		System.out.println("Leon cN is CEO of " + head3 .x1Name); 
		System.out.println("\n"); 
		// change Leader One while maintaining ruling family
		// Take note changing Big to small latest is passed on to successfull leaders
		head3.x1Name = (head3.x1Name).toLowerCase(); 
		System.out.println("Nikolas is King of " + head1 .x1Name); 
		System.out.println("Lorena is Queen of " + head2 .x1Name); 
		System.out.println("Leon cN is King of " + head3 .x1Name); 
		System.out.println("\n"); 
	} 
} 
