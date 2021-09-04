package day1.assignments;

public class Factorial {

	public static void main(String[] args) {

		int num = 5, res = 1;
		System.out.print("Factorial of a given number " + num + " is ");

		for (int i = num; i >= 2; i--) {
			res = res * i;
			System.out.print(i + "*");
		}
		System.out.println("=>" + res);
	}

}
