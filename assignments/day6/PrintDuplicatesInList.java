package assignments.day6;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20);

		Set<Integer> intSet = new LinkedHashSet<Integer>();
		Set<Integer> dupIntSet = new LinkedHashSet<Integer>();

		for (Integer integer : list) {
			if (!intSet.add(integer)) {
				dupIntSet.add(integer);
			}
		}

		System.out.println("Given Data            : " + list);
		System.out.println("Unique data extracted : " + intSet);
		System.out.println("Duplicates extracted  : " + dupIntSet);

	}

}
