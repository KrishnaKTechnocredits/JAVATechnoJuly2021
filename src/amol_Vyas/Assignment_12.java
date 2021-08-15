/*Assignment - 12 : 14th Aug'2021

1. Create a class named as Mall, which contains below methods
	a. itemAddedToCart()
	b. customerName()
	c. paymentDoneUsing()
		i. Visa Card ii. Cash
	d. displayCutomerInfo()
	e. needBill()
	f. haveCarryBag()
	g. decideSection()

	i.e. console should print: Harsh brought 12 items and payment done using visa card in section 1B

Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter
*/
package amol_Vyas;

public class Assignment_12 {

	int itemAdded;
	String customerName;
	String paymentType;
	String section;

	void setCustomerName(String cName) {
		customerName = cName;
	}

	void itemAddedtoCart(int item) {
		itemAdded = item;
	}

	void paymentDoneUsing(String type) {
		paymentType = type;
	}

	void decideSection() {
		if (itemAdded != 0 && paymentType != null) {
			if (itemAdded < 10 && paymentType.equals("Cash"))
				section = "1A";
			else if (itemAdded < 10 && paymentType.equals("Visa Card"))
				section = "1D";
			else if (itemAdded >= 10 && paymentType.equals("Cash"))
				section = "1C";
			else if (itemAdded >= 10 && paymentType.equals("Visa Card"))
				section = "1B";
		} else
			System.out.println("Item added or Payment type is not correct");
	}

	void needBill(boolean needBill) {
		if (itemAdded != 0 && paymentType != null && section != null) {
			if (needBill)
				System.out.println("Bill is printing");
			else
				System.out.println("You safe piece of paper by choosing e-Bill");
		} else
			System.out.println("Item added or Payment type is not correct");
	}

	void carryBag(boolean carryBag) {
		if (itemAdded != 0 && paymentType != null && section != null) {
			if (carryBag)
				System.out.println("Bag charges Rs.5 will be added to your bill");
		} else
			System.out.println("First purchase something then buy carry Bag");
	}

	void displayCustomerInfo() {
		if (itemAdded != 0 && paymentType != null && section != null)
			System.out.println(customerName + " brought " + itemAdded + " items and payment done using " + paymentType
					+ " in section " + section);
		else
			System.out.println("Item added or Payment type is not correct");
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.setCustomerName("Amol");
		assignment_12.itemAddedtoCart(12);
		assignment_12.paymentDoneUsing("Visa Card");
		assignment_12.decideSection();
		assignment_12.displayCustomerInfo();
		assignment_12.needBill(false);
		assignment_12.carryBag(true);
	}
}
