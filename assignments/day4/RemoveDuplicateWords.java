package assignments.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Given String               : " + text);

		String[] splitStr = text.split(" ");
		String[] newString = new String[splitStr.length];

		System.out.print("After Removing duplicates  : ");
		for (int i = 0; i < splitStr.length; i++) {
			if (newString[i] != "-1") {
				for (int j = i + 1; j < splitStr.length; j++) {
					if (splitStr[i].equals(splitStr[j])) {
						newString[j] = "-1";
					}
				}
				newString[i] = splitStr[i];
				System.out.print(newString[i] + " ");
			}
		}
	}

}
