package assignments.day5.bank;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {

		BankInfo bank = new BankInfo();
		bank.deposit();

		AxisBank axis = new AxisBank();
		axis.savings();
		axis.fixed();
		axis.deposit();

	}

	public void deposit() {
		System.out.println("Overridden: Deposit method overridden in AxisBank Class");
	}

}
