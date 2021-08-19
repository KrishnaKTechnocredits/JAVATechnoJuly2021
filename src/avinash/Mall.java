package avinash;

public class Mall {
	int noOfItems;
	String customerName;
	String paymentType;
	boolean needBill;
	boolean carryBag;
	String section;

	void itemAddedToCart(int items) {
		noOfItems = items;
	}

	void customerName(String custName) {
		customerName = custName;
	}

	void paymentDoneUsing(String paymentMode) {
		if (paymentMode.equals("Cash"))
			paymentType = "Cash";
		else
			paymentType = "Visa card";
	}

	void displayCutomerInfo() {
		System.out.println(customerName + " brought " + noOfItems + " items and payment done using " + paymentType+ " in section "+ section);

	}

	void needBill(boolean bill) {
		needBill = bill;
	}

	void haveCarryBag(boolean cBag) {
		carryBag = cBag;
	}

	void decideSection() {
		
		if (noOfItems < 10 && paymentType.equals("cash"))
			section = "1A";
		else if (noOfItems > 10 && paymentType.equals("Visa card"))
			section = "1B";
		else if (noOfItems > 10 && paymentType.equals("cash"))
			section = "1C";
		else if (noOfItems < 10 && paymentType.equals("Visa card"))
			section = "1D";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(22);
		mall.paymentDoneUsing("Visa card");
		mall.decideSection();
		mall.displayCutomerInfo();

	}

}

