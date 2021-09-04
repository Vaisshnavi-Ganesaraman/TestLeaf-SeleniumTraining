package day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8, firstNum = 0, secondNum = 1, sum;

		System.out.println("Fibonacci Series for the given range : " + range);
		System.out.println(firstNum+ "\n" + secondNum);

		for (int i = firstNum; i < (range-2); i++) { //first 2 numbers are printed already => (range-2)
			sum = firstNum + secondNum;              
			System.out.println(sum);                 //add the last 2 numbers to continue the Series
			
			firstNum=secondNum;                      //update the last 2 numbers => first = previous second number.
			secondNum=sum;                           //                          => second = previous sum value.
		}

	}

}
