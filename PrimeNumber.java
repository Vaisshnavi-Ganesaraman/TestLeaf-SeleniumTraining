package day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 13;
		boolean hasFactor = false;

		System.out.println("Other than 1 & " + num);  // Skip factors 1 & the number itself (in this case => 1 & 13)
		
		for (int i = 2; i < num; i++) {               // Iterates from 2 to (num-1) => 2,3,4,5,6,7,8,9,10,11,12

			if (num % i == 0) {
				hasFactor = true;                    // So when a random factor is hit sets boolean value to true
				System.out.println("Has factor : " + i); // and prints the factor
			}
		}

		if (hasFactor) {
			System.out.println("=>Thus, it is NOT a Prime Number.");
		} else {
			System.out.println("Has No Other Factors.\n=>Thus, it is a Prime Number.");
		}

	}

}
