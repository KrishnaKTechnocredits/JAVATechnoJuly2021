package sushant;

public class MallAssignment12 {
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

	void needBill(Boolean billIsRequired) {
		billPrint = billIsRequired;
	}
	void haveCarryBag(Boolean bagIsRequired) {
		bagCarry = bagIsRequired;
	}

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
		MallAssignment12 mallAssignment12 = new MallAssignment12();
		mallAssignment12.customerName("Virat");
		mallAssignment12.itemAddedToCart(12);
		mallAssignment12.paymentDoneUsing("visa card");
		mallAssignment12.decideSection();
		mallAssignment12.displayCutomerInfo();
		mallAssignment12.needBill(true);
		mallAssignment12.haveCarryBag(false);
	}

}