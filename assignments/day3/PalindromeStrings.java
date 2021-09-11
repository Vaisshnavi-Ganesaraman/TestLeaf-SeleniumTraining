package assignments.day3;

public class PalindromeStrings {

	public static void main(String[] args) {

		String str = "MADAM", reverseString = "";
		System.out.println("Given String : "+str);

		for (int i = str.length()-1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		
		System.out.println("Reversed String : "+reverseString);
		
		if(str.equals(reverseString)) {
			System.out.println("It is Palindrome String.");
		}else {
			System.out.println("It is NOT a Palindrome String.");
		}
	}

}
