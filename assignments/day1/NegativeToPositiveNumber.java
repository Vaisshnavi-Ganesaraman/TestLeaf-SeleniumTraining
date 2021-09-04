package day1.assignments;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -40;

		if (num < 0) {
			int positiveNum = Math.abs(num);
			System.out.println("The number " + num + " is converted to " + positiveNum);
		}

	}

}
