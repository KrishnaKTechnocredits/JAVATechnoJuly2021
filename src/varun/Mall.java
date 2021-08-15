package varun;

public class Mall {
	String customerName;
	String LastName;
	int itemQuantity;
	String Payment;
	String section;
	boolean hasCarrybag;
	boolean hasBill;

	void itemAddedToCart(int item) {
		itemQuantity = item;//11
	}

	void customerName(String name) {
		customerName = name;
	}

	void paymentDoneUsing(String payment) {
		Payment = payment;
		if (payment.equals("Visa"))
			System.out.println("Payment done by using " + payment + "card");
		else
			System.out.println("Payment done by cash");

	}

	void displayCutomerInfo() {
		System.out.println(customerName + " brought " + itemQuantity + " items and payment done using " + Payment
				+ " in section " + section);
	}

	void needBill(boolean neededBill) {
		hasBill = neededBill;
		if(hasBill)
			System.out.println("Thanks for going paperless");
		else
			System.out.println("You have taken the print of your bill");
	}

	void haveCarryBag(boolean carryBag) {
		hasCarrybag = carryBag;
		if(hasCarrybag)
			System.out.println("Thanks for not using a carry bag");
		else
			System.out.println("You are not environment Friendly");
	}

	void decideSection() {
		if (itemQuantity < 10 && Payment == "Cash")
			section = "1A";
		else if (itemQuantity > 10 && Payment.equals("Visa"))
			section = "1B";
		else if (itemQuantity > 10 && Payment == "Cash")
			section = "1C";
		else if (itemQuantity < 10 && Payment.equals("Visa"))
			section = "1D";
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(9);
		mall.customerName("Varun");
		mall.paymentDoneUsing("Visa");
		mall.decideSection();
		mall.displayCutomerInfo();
		mall.needBill(false);
		mall.haveCarryBag(false);

	}
}
