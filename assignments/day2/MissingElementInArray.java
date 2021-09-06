package assignments.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		
		Arrays.sort(arr);

		for (int i = 1; i <= arr.length; i++) {

			if (arr[i-1] == i) {
				continue;
			}
			System.out.println("The missing element is "+i);
			break;
		}
	}

}
