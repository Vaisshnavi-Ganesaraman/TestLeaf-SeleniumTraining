package assignments.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionFromList {

	public static void main(String[] args) {

		List<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> numList2 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));

		numList1.retainAll(numList2);

		System.out.println("Intersections / Common elements are: ");
		for (Integer integer : numList1) {
			System.out.println(integer);
		}

	}

}
