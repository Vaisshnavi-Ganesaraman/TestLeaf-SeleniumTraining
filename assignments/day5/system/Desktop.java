package assignments.day5.system;

public class Desktop extends Computer {

	public static void main(String[] args) {

		Desktop testObj = new Desktop();
		testObj.computerModel();
		testObj.desktopSize();
	}

	public void desktopSize() {
		System.out.println(
				"From Desktop class - inside desktopSize() : 19-inch screen (standard ratio): 1280 x 1024 pixels ");
	}
}
