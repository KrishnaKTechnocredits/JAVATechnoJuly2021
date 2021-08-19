package husain;

public class Assignment_12 {

	String custName;
	int itemCount;
	String paymentMethod;
	String decision;
	boolean needBill;
	boolean carryBag;

	void itemAddedToCart(int items) {
		itemCount = items;
			}

	void customerName(String name) {
		custName = name;
	}

	void paymentDoneUsing(String paymentUsed) {
		paymentMethod = paymentUsed;

	}

	void displayCutomerInfo() {
		if (decideSection().equals("Invalid"))
			System.out.println("Please enter valid count of items.");
		else if (decideSection().equals("Decision Pending"))
			System.out.println("Section under construction");
		else
			System.out.println(custName + " brought " + itemCount + " items and payment done using " + paymentMethod
					+ " in section " + decideSection());

	}

	void needBill(boolean bill) {
		needBill = bill;
		if (itemCount != 0 && itemCount!=10) {
			if (needBill)
				System.out.println("Bill will be provided at Section " + decision);
			else
				System.out.println("Bill has not been requested");
		}
		else if(itemCount == 10)
			System.out.println("Please contact the manager for billing");
	}

	void haveCarryBag(boolean haveBag) {

		carryBag = haveBag;
		if (itemCount != 0 && itemCount!=10) {
			if (carryBag) 
				System.out.println("Carry bag can be purchased at Section " + decision);
			else
				System.out.println("Carry bag not requested");
		}
		else if(itemCount == 10)
			System.out.println("Please contact the manager for help with carry bags");
		
	}

	String decideSection() {
		if(itemCount == 0)
			return "Invalid";
		else if(itemCount==10)
			return "Decision Pending";
		else if (itemCount < 10 && paymentMethod.equals("Cash"))
			return "1A";
		else if (itemCount > 10 && paymentMethod.equals("Visa card"))
			return "1B";
		else if (itemCount > 10 && paymentMethod.equals("Cash"))
			return "1C";
		else 
			return "1D";


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_12 obj = new Assignment_12();
		obj.customerName("Harsh");
		obj.paymentDoneUsing("Visa card");
		obj.itemAddedToCart(12);
		obj.displayCutomerInfo();
		obj.needBill(true);
		obj.haveCarryBag(false);
	}

}
