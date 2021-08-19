package vivek;

public class Mall {

	int itemAdded;
	String customerName;
	String paymentType;

	void itemAddedToCart(int itemCount) {
		itemAdded = itemCount;

	}

	void customerName(String name) {
		customerName = name;

	}

	void paymentDoneUsing(String payment) {
		paymentType = payment;
	}

	void displayCustomerInfo() {
		System.out.println("\nBelow are the customer details :");
		System.out.println("Customer name is " + customerName);
		System.out.println("No of items added to the cart is " + itemAdded);
		System.out.println("Payment type is " + paymentType);
	}

	void needBill(boolean status) {
		if (status)
			System.out.println("Bill will be provided");
		else
			System.out.println("Bill will not be providid");
	}

	void haveCarryBag(boolean status) {
		if (status)
			System.out.println("Carry Bag will be provided");
		else
			System.out.println("Carry Bag will not be providid");
	}

	String decidesection() {

		if (itemAdded < 10 && paymentType.equals("Cash"))
			return "Section 1A";
		else if (itemAdded > 10 && paymentType.equals("Visa Card"))
			return "Section 1B";
		else if (itemAdded > 10 && paymentType.equals("Cash"))
			return "Section 1C";
		else if (itemAdded < 10 && paymentType.equals("Visa Card"))
			return "Section 1D";
		return "Item added or payment type is incorrect";

	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Vivek");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("Visa Card");

		System.out.println(mall.customerName + " brought " + mall.itemAdded + " items and payment done using "
				+ mall.paymentType + " in " + mall.decidesection());
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCustomerInfo();
	}

}
