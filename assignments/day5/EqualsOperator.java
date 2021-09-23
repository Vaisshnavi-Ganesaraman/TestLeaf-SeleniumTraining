package assignments.day5;

public class EqualsOperator {
	public static void main(String[] args) {

		// Strings are immutable thus creates 2 diff objects for same String values
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		// Checks memory location
		if (str3 == str4) {
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");

		// Checks only Values
		if (str3.equals(str4)) {
			System.out.println(" Same text");
		}
	}

}
