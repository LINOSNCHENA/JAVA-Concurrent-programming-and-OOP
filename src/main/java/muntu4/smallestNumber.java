package muntu4;

public class smallestNumber {
	public static void main(String[] args) {
		int arr[] = { 8, 809, 12, 194, 209, 214, 66, 3, 424 };
		int d = arr.length;
		int largest = arr[0];
		int secondLargest = arr[0];
		System.out.println("\n ============================= START =================" + "\n");
		for (int i = 0; i < d; i++) {
			System.out.print("Point :  ");
			System.out.print(i + "\t");
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

		System.out.print("\n First largest unit is:" + largest);
		System.out.println("\n Second largest unit is:" + secondLargest + "\n");
		System.out.println("========================= SUMMARY =====================");
		System.out.print("\n First unit is:" + arr[0]);
		// 2nd element because index starts from 0
		System.out.println("\n Last unit is:" + arr[d - 1] + "\n");
		// 1st element because index starts from 0
		System.out.println("========================= END =======================" + "\n");
	}
}
