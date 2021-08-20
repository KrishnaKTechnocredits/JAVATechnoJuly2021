package ashit;

public class Assignment_12 {

	String custName;
	int itemsCount;
	String paymentInfo;

	void itemAddedToCart(int tempItemsCount) {
		itemsCount = tempItemsCount;
	}

	void customerName(String tempName) {
		custName = tempName;
	}

	void paymentDoneUsing(String paymentType) {
		paymentInfo = paymentType;
	}

	void displayCustomerInfo() {
		System.out.println("Customer details are as follows: ");
		System.out.println("Customer Name = " + custName);
		System.out.println("Number of items purchased by the customer are " + itemsCount);

	}

	void needBill(boolean status) {
		if (status)
			System.out.println("Bill is provided ");
		else
			System.out.println("Bill is not provided ");
	}

	void haveCarryBag(boolean status) {
		if (status)
			System.out.println("CarryBag is provided ");
		else
			System.out.println("CarryBag is not provided ");

	}

	String getDecisionSection() {
		if (itemsCount < 10 && paymentInfo.equals("Cash"))
			return "Section 1A";
		else if (itemsCount > 10 && paymentInfo.equals("Visa Card"))
			return "Section 1B";
		else if (itemsCount > 10 && paymentInfo.equals("Cash"))
			return "Section 1C";
		else if (itemsCount < 10 && paymentInfo.equals("Visa Card"))
			return "Section 1D";

		return "Item added or payment type is incorrect";
	}

	public static void main(String[] args) {

		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.customerName("Ashit");
		assignment_12.itemAddedToCart(25);
		assignment_12.paymentDoneUsing("Cash");
		System.out.println(
				assignment_12.custName + " brought " + assignment_12.itemsCount + " items and  Payment done using "
						+ assignment_12.paymentInfo + " in " + assignment_12.getDecisionSection() + "\n");
		assignment_12.displayCustomerInfo();
		assignment_12.needBill(true);
		assignment_12.haveCarryBag(false);

	}

}