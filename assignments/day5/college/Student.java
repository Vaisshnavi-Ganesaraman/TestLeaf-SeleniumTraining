package assignments.day5.college;

public class Student extends Department {

	public static void main(String[] args) {

		String studentName = "Vaisshnavi";
		int rollNumber = 108;
		String batch = "2015-2019";

		Student studObj = new Student();

		System.out.println("Displaying Student Info from Student Class : ");
		System.out.println("Student Name : " + studentName);
		System.out.println("Roll number : " + rollNumber);
		System.out.println("Batch : " + batch);

		System.out.println("\n");
		studObj.displayDeptInfo();

		System.out.println("\n");
		studObj.displayCollegeInfo();

	}

}
