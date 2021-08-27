package himanshu;

public class Assignment_12 {

	String customerName  ;
	int itemCount;
	String paymentMode;
	String section;

	void setCustomerName(String name) {
		customerName = name;
	}

	void itemAddedToCart(int count) {
		itemCount = count;
	}

	void paymentDoneUsing(String mode) {
		paymentMode = mode;
	}

	void decideSection() {
		if (itemCount < 10 && paymentMode.equals("cash"))
			section = "1A";
		else if (itemCount > 10 && paymentMode.equals("visa card"))
			section = "1B";
		else if (itemCount > 10 && paymentMode.equals("cash"))
			section = "1C";
		else if (itemCount < 10 && paymentMode.equals("visa card"))
			section = "1D";
	}

	void displayCustomerInfo() {
		System.out.println(customerName + " has brought " + itemCount + " items and payment done using " + paymentMode
				+ " in Section " + section);
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.setCustomerName("Edward");
		assignment_12.itemAddedToCart(12);
		assignment_12.paymentDoneUsing("visa card");
		assignment_12.decideSection();
		assignment_12.displayCustomerInfo();

	}
}
