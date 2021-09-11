package assignments.day3;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {

		String str1 = "posts";
		String str2 = "stops";

		if (str1.length() == str2.length()) {

			System.out.println("Length of the strings are equal : " + str1.length());

			char[] arr1 = str1.toCharArray();
			char[] arr2 = str1.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			str1 = String.valueOf(arr1); // valueOf() converts char[] -> String
			str2 = String.valueOf(arr2);

			System.out.println("String 1 sorted : " + str1);
			System.out.println("String 2 sorted : " + str2);

			if (str1.equals(str2)) {
				System.out.println("Thus Equal");
			} else {
				System.out.println("Strings Not Equal");
			}
		} else {
			System.out.println("Length of the strings are not equal. ");
		}
	}

}
