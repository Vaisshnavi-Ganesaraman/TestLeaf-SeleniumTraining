package assignments.day2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 454, rem, reverseNum = 0;
		int givenNum = num;

		while (num != 0) {
			rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
			num = num / 10;
		}
		System.out.println("The reverse of "+givenNum+" is : " + reverseNum);

		if (givenNum == reverseNum) {
			System.out.println("=>It is a Palindrome Number");
		} else {
			System.out.println("=>It is NOT a Palindrome Number");
		}
	}

}
