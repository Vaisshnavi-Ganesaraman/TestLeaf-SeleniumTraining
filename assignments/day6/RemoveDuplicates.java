package assignments.day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String test = "PayPal India";

		char[] charArray = test.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			if (!charSet.add(charArray[i])) {
				dupCharSet.add(charArray[i]);
			}
		}

		System.out.println("Removed Duplicates from \"" + test + "\" : ");
		for (Character character : charSet) {
			if (character.equals(' '))
				continue;
			System.out.print(character);
		}

	}

}
