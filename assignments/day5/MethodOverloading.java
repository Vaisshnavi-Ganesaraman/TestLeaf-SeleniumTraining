package assignments.day5;

public class MethodOverloading {

	public static void main(String[] args) {

		String studentName = "Vaisshnavi";
		int rollNumber = 108;
		String batch = "2015-2019";

		MethodOverloading studObj = new MethodOverloading();

		studObj.displayStudentInfo(rollNumber);
		studObj.displayStudentInfo(studentName, rollNumber);
		studObj.displayStudentInfo(studentName, batch);

	}

	public void displayStudentInfo(int rollNumber) {
		System.out.println("Displaying Student Info : Inside displayStudentInfo(int rollNumber)");
		System.out.println("Roll number : " + rollNumber);

	}

	public void displayStudentInfo(String name, int rollNumber) {
		System.out.println("\nDisplaying Student Info : Inside displayStudentInfo(String name, int rollNumber)");
		System.out.println("Student Name : " + name);
		System.out.println("Roll number : " + rollNumber);

	}

	public void displayStudentInfo(String name, String batch) {
		System.out.println("\nDisplaying Student Info : Inside displayStudentInfo(String name, String batch)");
		System.out.println("Student Name : " + name);
		System.out.println("Batch : " + batch);
	}

}
