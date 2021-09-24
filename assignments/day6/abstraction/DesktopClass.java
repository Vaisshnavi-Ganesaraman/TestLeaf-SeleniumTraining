package assignments.day6.abstraction;

public class DesktopClass implements SoftwareInterface, HardwareInterface {

	public void hardwareResources() {
		System.out.println("Hardware interface - Implemented here");

	}

	public void softwareResources() {
		System.out.println("Software interface - Implemented here");

	}

	public void desktopClass() {
		System.out.println("Own Implementation method");
	}

	public static void main(String[] args) {
		DesktopClass obj = new DesktopClass();

		obj.softwareResources();
		obj.hardwareResources();
		obj.desktopClass();
	}

}
