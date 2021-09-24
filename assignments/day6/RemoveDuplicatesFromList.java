package assignments.day6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Given text : " + text);

		String[] splitArray = text.split(" ");
		List<String> splitList = new ArrayList<String>();

		for (int i = 0; i < splitArray.length; i++) {
			splitList.add(splitArray[i]);
		}

		Set<String> splitSet = new LinkedHashSet<String>();
		splitSet.addAll(splitList);

		System.out.println("After removing duplicates : ");
		for (String string : splitSet) {
			System.out.print(string + " ");
		}

	}

}
