package sameer;

public class Assignment12 {
	int noOfItems;
	String custName;
	String paymentMethod;
	String section;
	boolean needBill;
	boolean carryBag;

	void customerName(String cName) {
		custName = cName;
	}

	void itemAddedToCart(int itemNumbers) {
		noOfItems = itemNumbers;
	}

	void paymentDoneUsing(String payMethod) {
		paymentMethod = payMethod;
	}

	void displayCutomerInfo() {
		System.out.println(
				custName + " has brought " + noOfItems + " items Through " + paymentMethod + " In Section " + section);
	}

	void decideSection() {
		if (noOfItems < 10 && paymentMethod.equals("cash")) {
			section = "1A";
		} else if (noOfItems > 10 && paymentMethod.equals("Visa Card")) {
			section = "1B";
		} else if (noOfItems > 10 && paymentMethod.equals("cash")) {
			section = "1C";
		} else if (noOfItems < 10 && paymentMethod.equals("Visa Card")) {
			section = "1D";
		}

	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.customerName("Harsh");
		assignment12.itemAddedToCart(12);
		assignment12.paymentDoneUsing("cash");
		assignment12.decideSection();
		assignment12.displayCutomerInfo();
	}
}
