package siddharth;

public class Assignment12 {
	int itemCount;
	String custName;
	String payMode;
	String section;

	void itemAddedToCart(int item) {
		itemCount = item;
	}

	void customerName(String customername) {
		custName = customername;
	}

	void paymentDoneUsing(String mode) {
		payMode = mode;
	}

	void displayCustomerInfo() {
		System.out.println(custName + " bought " + itemCount + " items and payment done using " + payMode
				+ " in section " + section);
	}

	void decideSection() {

		if (itemCount < 10 && payMode.equals("Cash")) {

			section = "1A";

		} else if (itemCount > 10 && payMode.equals("Visa")) {

			section = "1B";

		} else if (itemCount > 10 && payMode.equals("Cash")) {

			section = "1C";

		} else if (itemCount < 10 && payMode.equals("Visa")) {

			section = "1D";

		}

	}

	public static void main(String[] args) {
		Assignment12 mall = new Assignment12();
		mall.customerName("Siddharth");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsing("Cash");
		mall.decideSection();
		mall.displayCustomerInfo();

	}

}
