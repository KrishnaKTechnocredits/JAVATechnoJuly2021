package aniket;

public class Assignment_12{
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
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " with bill and carry bag both.");
		else if (!isBill && isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " without bill and with carry bag.");
		else if (isBill && !isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " with bill and without carry bag.");
		else
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " without bill and carry bag both.");
	}
	
	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.setCustomerName("Aniket");
		assignment_12.itemAddedToCart(11);
		assignment_12.paymentDoneUsing("CASH");
		assignment_12.needBill(true);
		assignment_12.haveCarryBag(true);
		assignment_12.displayCutomerInfo();
	}
}
