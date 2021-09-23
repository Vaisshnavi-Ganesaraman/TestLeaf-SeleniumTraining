package assignments.day4;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";

		char[] charArray = test.toCharArray();

		System.out.println("Given string : " + test);
		System.out.print("\nReversed string : ");

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

	}

}
