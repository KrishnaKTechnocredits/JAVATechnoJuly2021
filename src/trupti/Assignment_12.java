package trupti;

public class Assignment_12 {
	String custName;
	String paymentMethod;
	int itemsadded = 0;

	void setCustomerDetails(String name) {
		custName = name;
	}

	int itemsAddedToCart(int items) {
		itemsadded += items;
		return itemsadded;
	}

	String paymentDoneUsing(String paidBy) {

		if (paidBy.equals("CASH")) {
			paymentMethod = paidBy;
			return paidBy;
		} else if (paidBy.equals("VISA CARD")) {
			paymentMethod = paidBy;
			return paidBy;
		} else

			System.out.println("Invalid payment type");

		return null;

	}

	boolean needBill(boolean status) {
		if (status) {
			System.out.println("Your bill Thank you. Visit Again");
			return true;
		} else
			System.out.println("Hey " + custName + " lets Save paper & Save Environment.");
		return false;
	}

	boolean needCarryBags(boolean status) {
		if (status) {
			System.out.println("Your carry bag.");
			return true;
		} else
			System.out.println("Thank You " + custName + " Say no to plastic.");
		return false;
	}

	String decideSection() {
		if (itemsadded > 0) {
			if (itemsadded < 10 && paymentMethod.equals("CASH"))
				return "1A";
			else if (itemsadded >= 10 && paymentMethod.equals("VISA CARD"))
				return "1B";
			else if (itemsadded >= 10 && paymentMethod.equals("CASH"))
				return "1C";
			else if (itemsadded < 10 && paymentMethod.equals("VISA CARD"))
				return "1D";
		}
		return null;
	}

	void displayCustomerInfo() {
		System.out.println(custName + " bought " + itemsadded + " items and payment is done using " + paymentMethod
				+ " in section " + decideSection());
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12_1 = new Assignment_12();
		assignment_12_1.setCustomerDetails("Trups");
		assignment_12_1.itemsAddedToCart(14);
		assignment_12_1.paymentDoneUsing("CASH");
		assignment_12_1.displayCustomerInfo();
		assignment_12_1.needBill(true);
		assignment_12_1.needCarryBags(false);
		System.out.println("-----------------------------------------------------");

		Assignment_12 assignment_12_2 = new Assignment_12();
		assignment_12_2.setCustomerDetails("Mandar");
		assignment_12_2.itemsAddedToCart(8);
		assignment_12_2.paymentDoneUsing("VISA CARD");
		assignment_12_2.displayCustomerInfo();
		assignment_12_2.needBill(false);
		assignment_12_2.needCarryBags(true);
		System.out.println("--------------------------------------------------");

		Assignment_12 assignment_12_3 = new Assignment_12();
		assignment_12_3.setCustomerDetails("Trupti");
		System.out.println(assignment_12_3.custName + " has bought " + assignment_12_3.itemsAddedToCart(35)
				+ " items And  Payment is done using " + assignment_12_3.paymentDoneUsing("VISA CARD") + " in Section "
				+ assignment_12_3.decideSection());
		assignment_12_3.needBill(false);
		assignment_12_3.needCarryBags(false);
		System.out.println("----------------------------------------------------");
		assignment_12_3.paymentDoneUsing("VISCARD");
	}

}
