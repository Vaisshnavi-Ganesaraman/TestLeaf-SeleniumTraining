package assignments.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 7, 6, 8);

		Collections.sort(list);
		int count = 1;

		for (Integer integer : list) {
			if (count == integer) {
				count++;
			} else {
				System.out.println("Missing Element : " + count);
				break;
			}
		}

	}

}
