package suruchi;

public class Mall_Assignment12 {

	String firstName, section, finalPaymentMode;
	int finalItemCount;
	// boolean carryBagProvided, billRequested;

	void customerName(String fname) {
		firstName = fname;
	}

	void itemAddedToCart(int itemCount) {
		finalItemCount = itemCount;

	}

	void paymentDoneUsing(String paymentMode) {
		finalPaymentMode = paymentMode;

	}

	/*
	 * void haveCarryBag(boolean carryBag) { if(!carryBag) carryBagProvided =
	 * carryBag; }
	 * 
	 * void needBill(boolean billNeeded) { billRequested = billNeeded; }
	 */

	void decideSection() {
		if (finalItemCount < 10 && finalPaymentMode.equals("VISA card"))
			section = "1A";
		else if (finalItemCount > 10 && finalPaymentMode.equals("VISA card"))
			section = "1B";
		else if (finalItemCount > 10 && finalPaymentMode.equals("Cash"))
			section = "1C";
		else
			section = "1D";
	}

	void displayCustomerInfo() {
		if (finalItemCount > 0)
			System.out.println(firstName + " bought " + finalItemCount + " items and payment done using "
					+ finalPaymentMode + " in section " + section + ".");
		else
			System.out.println("No items bought by " + firstName);
	}

	public static void main(String[] args) {

		Mall_Assignment12 mall_Assignment12 = new Mall_Assignment12();
		mall_Assignment12.customerName("Harsh");
		mall_Assignment12.itemAddedToCart(12);
		mall_Assignment12.paymentDoneUsing("VISA card");
		/*
		 * mall_Assignment12.haveCarryBag(true); mall_Assignment12.needBill(false);
		 */
		mall_Assignment12.decideSection();
		mall_Assignment12.displayCustomerInfo();
	}
}