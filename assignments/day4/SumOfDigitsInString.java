package assignments.day4;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String realStr = "Tes12Le79af65";
		String replaceIntStr = realStr.replaceAll("[\\D]", ""); // [\\d] - regEx for finding all digits
		System.out.println("Given String : " + realStr);
		System.out.println("Digits extracted from string : " + replaceIntStr);

		int number = Integer.parseInt(replaceIntStr);
		int sum = 0, rem;
		while (number != 0) {
			rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		System.out.println("Sum of digits : " + sum);
	}

}
