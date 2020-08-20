package samaphores;

public class Smallestx2 {
	public static void main(String[] args) {
		int arr[] = { 8, 809, 12, 194, 209, 214, 66, 3, 424 };
		int d = arr.length;
		int largest = arr[0];
		int secondLargest = arr[0];
		System.out.println("============================= START =================" + "\n");
		System.out.println("Last six units of humidity are:");
		for (int i = 0; i < d; i++) {
			System.out.print(arr[i] + "\t");
			System.out.print(arr[i] + "\n");
		}

		for (int i = 0; i < d; i++) {
			if (arr[i] > largest && arr[i] > secondLargest) {
				secondLargest = largest; // yes, the largest is demoted second
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i]; // yes is further demoted to third!
			}
		}

		System.out.print("\nFirst largest unit is:" + largest);
		System.out.println("\nSecond largest unit is:" + secondLargest + "\n");
		System.out.println("========================= SUMMARY =====================");
		System.out.print("\nFirst unit is:" + arr[0]);
		// 2nd element because index starts from 0
		System.out.println("\nLast unit is:" + arr[d - 1] + "\n");
		// 1st element because index starts from 0
		System.out.println("========================= END =======================" + "\n");
	}
}
