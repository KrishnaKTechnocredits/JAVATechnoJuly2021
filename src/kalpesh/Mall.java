package kalpesh;

public class Mall {
	int items;
	String paymentMode;
	boolean isBill;
	boolean isCarryBag;
	String customerName;

	void setCustomerName(String custName) {
		customerName = custName;
	}

	void itemAddedToCart(int itemsCount) {
		if (itemsCount > 0)
			items = itemsCount;
	}

	void paymentDoneUsing(String mode) {
		if (mode.equals("CASH") || mode.equals("VISA_CARD"))
			paymentMode = mode;
		else
			System.out.println("Wrong payment method");
	}

	void needBill(boolean isBillPresent) {
		isBill = isBillPresent;
	}

	void haveCarryBag(boolean isCarryBagPresent) {
		isCarryBag = isCarryBagPresent;
	}

	String decideSection() {
		if (items < 10 && paymentMode.equals("CASH"))
			return "section 1A";
		else if (items >= 10 && paymentMode.equals("VISA_CARD"))
			return "section 1B";
		else if (items >= 10 && paymentMode.equals("CASH"))
			return "section 1c";
		else if (items < 10 && paymentMode.equals("VISA_CARD"))
			return "section 1D";
		else
			return "section";
	}

	void displayCutomerInfo() {
		if (isBill && isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode
					+ " in " + decideSection() + " with bill and carry bag both.");
		else if (!isBill && isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode
					+ " in " + decideSection() + " without bill and with carry bag.");
		else if (isBill && !isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode
					+ " in " + decideSection() + " with bill and without carry bag.");
		else
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode
					+ " in " + decideSection() + " without bill and carry bag both.");
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.setCustomerName("Kalpesh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("VISA_CARD");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();
	}

}
