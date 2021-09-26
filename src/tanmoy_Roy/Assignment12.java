
package tanmoy_Roy;

public class Assignment12 {

	int itemsCount;
	String customerName,paymentMethod;
	boolean billNeeded,carryBagNeeded;

	void itemAddedToCart(int items) {
		if (items>0)
			itemsCount = items;
		else
			System.out.println("Invalid item count entered");

	}

	void customerName(String name) {
		customerName = name;
	}

	void paymentDoneUsing(String paymentType) {
		if (paymentType.equals("Cash") || paymentType.equals("Visa Card"))
			paymentMethod = paymentType;
		else
			System.out.println("Invalid payment method.Available types 1) Cash  2)Visa Card");
	}

	void haveCarryBag(boolean carryBag) {
		carryBagNeeded=carryBag;
	}

	void needBill(boolean bill) {
		billNeeded=bill;
	}

	void displayCustomerInfo() {
		System.out.println("Customer Name: "+customerName+"\nShopped using "+paymentMethod);
		if(billNeeded)
			System.out.println("Customer has requested for bill");
		else
			System.out.println("Customer didnot requested for bill");
		if(carryBagNeeded)
			System.out.println("Customer has requested for Carry Bags");
		else
			System.out.println("Customer didnot requested for Carry Bags");
	}

	String decideSection() {
		if (itemsCount<10 && paymentMethod.equals("Cash"))
			return "1A";
		else if (itemsCount>10 && paymentMethod.equals("Visa Card"))
			return "1B";
		else if (itemsCount>10 && paymentMethod.equals("Cash"))
			return "1C";
		else
			return "1D";
	}

	public static void main(String[] args) {
		Assignment12 mall = new Assignment12();
		mall.customerName("Tanmoy Roy");
		mall.itemAddedToCart(12);
		mall.haveCarryBag(true);
		mall.needBill(true);
		mall.paymentDoneUsing("Visa Card");
		mall.displayCustomerInfo();
	}
}