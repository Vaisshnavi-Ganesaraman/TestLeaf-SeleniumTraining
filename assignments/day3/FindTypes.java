package assignments.day3;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/*
		 * Pseudo Code: a) Convert the String to character array b) Traverse through
		 * each character (using loop) c) Find if the given character is what type using
		 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
		 * iv) else -> consider as special character
		 */

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isSpaceChar(charArray[i])) {
				space++;
			} else if (Character.isDigit(charArray[i])) {
				num++;
			} else {
				specialChar++;
			}

		}

		System.out.println("Total characters in the given string : "+charArray.length);
		System.out.println("No. of Letters: " + letter);
		System.out.println("No. of Space: " + space);
		System.out.println("No. of Number: " + num);
		System.out.println("No. of SpecialCharcter: " + specialChar);

	}

}
