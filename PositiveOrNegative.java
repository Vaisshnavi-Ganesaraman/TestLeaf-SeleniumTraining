package day1.assignments;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int num = 35;

		if (num < 0) {
			System.out.println("The given number " + num + " is a Negative number.");
		}else if(num > 0 ) {
			System.out.println("The given number " + num + " is a Positive number.");
		}else {
			System.out.println("The given number is neither Negative nor Positive.");
		}
	}

}
