package assignments.day5;

public class StringFunctions {
	public static void main(String[] args) {

		String text = "Java Exercise";

		System.out.println("Character E is at index : " + text.indexOf('E'));
		System.out.println("Character E is at index : " + text.indexOf('s'));

		String str1 = "I am Learning Java";
		String str2 = "I am learning java";

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("\nIgnoring case : Strings are Equal");
		} else {
			System.out.println("Ignoring case : Strings are Unequal");
		}

		if (str1.equals(str2)) {
			System.out.println("Case sensitive : Strings are Equal");
		} else {
			System.out.println("Case sensitive : Strings are Unequal");
		}

		String sentence = "I am working with Java8";
		String replacedString = sentence.replace("8", "11").concat("#");
		System.out.println("\nReplaced String : " + replacedString);
		System.out.println("Substring between 5-14 chars :" + sentence.substring(5, 14));

	}

}
