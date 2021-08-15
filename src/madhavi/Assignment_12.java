package madhavi;

public class Assignment_12 {
	String customerName;
	String paymentType;
	int noOfItems;
	Boolean billPrint;
	Boolean bagCarry;
	String section;

	void itemAddedToCart(int items) {
		noOfItems = items;
	}

	void customerName(String name) {
		customerName = name;

	}

	void paymentDoneUsing(String paymentOption) {
		paymentType = paymentOption;
	}

	void displayCutomerInfo() {
		System.out.println(customerName + " brought " + noOfItems + " items and payment done using " + paymentType
				+ " in section " + section);
	}

	/*void needBill(Boolean billIsRequired) {
		billPrint = billIsRequired;

	}

	void haveCarryBag(Boolean bagIsRequired) {
		bagCarry = bagIsRequired;
	}*/

	void decideSection() {

		if (noOfItems < 10 && paymentType.equals("cash")) {
			section = "1A";
		} else if (noOfItems > 10 && paymentType.equals("visa card")) {
			section = "1B";
		} else if (noOfItems > 10 && paymentType.equals("cash")) {
			section = "1C";
		} else if (noOfItems < 10 && paymentType.equals("visa card")) {
			section = "1C";
		}

	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.customerName("Harsh");
		assignment_12.itemAddedToCart(12);
		assignment_12.paymentDoneUsing("visa card");
		assignment_12.decideSection();
		assignment_12.displayCutomerInfo();
		//assignment_12.needBill(true);
		//assignment_12.haveCarryBag(false);
	}

}
