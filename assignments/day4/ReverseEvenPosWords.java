package assignments.day4;

public class ReverseEvenPosWords {

	public static void main(String[] args) {

		String test = "I am a software tester";

		String[] splitStr = test.split(" ");

		System.out.println("Given string : " + test);
		System.out.print("\nReversed - Even position words : ");

		for (int i = 0; i < splitStr.length; i++) {
			if (i % 2 != 0) {
				for (int j = splitStr[i].length() - 1; j >= 0; j--) {
					System.out.print(splitStr[i].charAt(j));
				}
			} else {
				System.out.print(splitStr[i]);
			}
			System.out.print(" ");
		}

	}

}
