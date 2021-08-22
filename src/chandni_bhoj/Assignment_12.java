package chandni_bhoj;

public class Assignment_12 {

	int itemInCart;
	String customerName;
	String paymentUsing;
	boolean needBill;
	boolean haveCarryBag;

	void itemAddedToCart (int totalItem) {
		itemInCart = totalItem;
	}

	void setCustomerName (String custName) {
		customerName = custName;
	}

	void paymentDoneUsing (String paymentOption) {
		if (paymentOption.equals ("Cash") || paymentOption.equals ("Visa Card")) {
			paymentUsing = paymentOption;
		}
	}

	void displayCustomerInfo () {
		System.out.println (customerName + " brought " + itemInCart + " items and payment done using " + paymentUsing + " in " + decideSection());
	}

	void isBillRequired (boolean billreq) {
		needBill = billreq;

	}

	void CarryBagReq (boolean carryBagNeeded) {
		haveCarryBag = carryBagNeeded;
	}

	String decideSection () {
		if (itemInCart < 10 && paymentUsing.equals("Cash"))
			return "Section 1A";
		else if (itemInCart > 10 && paymentUsing.equals("Visa Card"))
			return "Section 1B";
		else if (itemInCart > 10 && paymentUsing.equals("Cash"))
			return "Section 1C";
		else 
			return "Section 1D";

	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12 ();
		assignment_12.itemAddedToCart(12);
		assignment_12.setCustomerName("Bhavika Bhojwani");
		assignment_12.paymentDoneUsing("Visa Card");
		assignment_12.displayCustomerInfo();

	}

}
