package genius;

public class Assignment_12 {

	int itemAdded;
	String customerName;
	String paymentType;

	void setCustomerName(String name) {
		customerName = name;
	}

	void itemAddedtoCart(int itemcount) {
		itemAdded = itemcount;
	}

	void paymentDoneUsing(String type) {
		paymentType = type;
	}

	String decideSection() {
		if (itemAdded != 0 && paymentType != null) {
			if (itemAdded < 10 && paymentType.equals("Cash"))
				return "Section 1A";
			else if (itemAdded < 10 && paymentType.equals("Visa Card"))
				return "Section 1D";
			else if (itemAdded >= 10 && paymentType.equals("Cash"))
				return "Section 1C";
			else if (itemAdded >= 10 && paymentType.equals("Visa Card"))
				return "Section 1B";
		} 
	    return "Item added or Payment type is not correct";
	}

	void needBill(boolean needBill) {
		if (itemAdded != 0 && paymentType != null) {
			if (needBill)
				System.out.println("Printed bill will be given");
			else
				System.out.println("Bill is not required");
		} else
			System.out.println("Item added or Payment type is not correct");
	}

	void carryBag(boolean carryBag) {
		if (itemAdded != 0 && paymentType != null) {
			if (carryBag)
				System.out.println("If you want carry bag then extra charges will be applied");
		} else
			System.out.println("First purchase something then buy carry Bag");
	}

	void displayCustomerInfo() {
		if (itemAdded != 0 && paymentType != null)
			System.out.println(customerName + " has brought " + itemAdded + " items and payment done using " + paymentType
					+ " in " + decideSection());
		else
			System.out.println("Item added or Payment type is not correct");
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.setCustomerName("Genius Patel");
		assignment_12.itemAddedtoCart(12);
		assignment_12.paymentDoneUsing("Visa Card");
		assignment_12.decideSection();
		assignment_12.displayCustomerInfo();
		assignment_12.needBill(true);
		assignment_12.carryBag(true);
	}

}
