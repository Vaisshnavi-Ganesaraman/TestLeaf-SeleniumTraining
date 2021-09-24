package assignments.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestFromList {

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(3, 2, 11, 4, 6, 7);

		System.out.println("Given Input : " + data);
		Collections.sort(data);
		Collections.reverse(data);
		System.out.println("Sorted and reversed List : " + data);

		int index = 1, count = 0;

		for (Integer integer : data) {
			if (count == index)
				System.out.println("Second largest integer is : " + integer);
			count++;
		}

	}

}
