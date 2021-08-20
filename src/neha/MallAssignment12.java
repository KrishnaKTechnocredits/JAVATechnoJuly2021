package neha;

public class MallAssignment12 {
	String customerName;
	Boolean successfulPayment = false;

	int itemAddedToCart(int itemCount) {
		if (itemCount == 0) {
			System.out.println("Item not added in cart , please add items to cart for proceeding");
			return itemCount;
		} else {
			System.out.println("Adding item to cart...");
			return itemCount;
		}

	}

	void customerName(String name) {
		customerName = name;
	}

	String paymentDoneUsing(String paymentMode) {
		if (paymentMode == "Visa Card") {
			return paymentMode;
		} else if (paymentMode == "Cash") {
			return paymentMode;
		} else {
			return "Invalid Payment mode, this can not be accepted";
		}
	}

	void displayCutomerInfo(String section, int itemCount, String paymentMode) {
		System.out.println(customerName + " bought " + itemCount + " items and payment done using " + paymentMode
				+ " in section " + section);
	}

	void needBill(Boolean flag) {
		if (flag&&successfulPayment)
			System.out.println("Customer needs bill");
		else
			System.out.println("Customer does not require bill");

	}

	void haveCarryBag(Boolean flag) {
		if (!flag&&successfulPayment)
			System.out.println("Please pay Rs.5 extra for carry bag if you require carry bag");
	}

	void decideSection(int itemCount, String paymentMode) {
		if (itemCount == 0) {
			System.out.println("No items are added in cart");
		} else if (paymentMode != "Visa Card" && paymentMode != "Cash") {
			System.out.println("Invalid Payment Mode");
		} else if (itemCount <= 10 && paymentMode == "Cash") {
			successfulPayment = true;
			displayCutomerInfo("1A", itemCount, paymentMode);
		} else if (itemCount > 10 && paymentMode == "Visa Card") {
			successfulPayment = true;
			displayCutomerInfo("1B", itemCount, paymentMode);
		} else if (itemCount > 10 && paymentMode == "Cash") {
			successfulPayment = true;
			displayCutomerInfo("1C", itemCount, paymentMode);
		} else if (itemCount <= 10 && paymentMode == "Visa Card") {
			successfulPayment = true;
			displayCutomerInfo("1D", itemCount, paymentMode);
		} else {
			System.out.println("Invalid payment or empty cart");
		}
	}

	public static void main(String[] args) {
		MallAssignment12 mallAssignment12 = new MallAssignment12();
		mallAssignment12.customerName("Parth Joshi");
		int totalItemCount = mallAssignment12.itemAddedToCart(12);
		String paymentMode = mallAssignment12.paymentDoneUsing("Visa Card");
		mallAssignment12.decideSection(totalItemCount, paymentMode);
		mallAssignment12.needBill(true);
		mallAssignment12.haveCarryBag(false);
	}

}
