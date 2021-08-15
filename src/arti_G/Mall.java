package arti_G;

/*1. Create a class named as Mall, which contains below methods
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
• If items are less than 10 and payment done using visa card, then send customer to section 1D*/
public class Mall {

	int itemCount;
	String payment;
	String name;
	String section;

	void itemsAddedToCart(int item) {
		itemCount = item;
	}

	void customerName(String customer) {
		name = customer;
	}

	void paymentDoneUsing(String paymentMode) {
		payment = paymentMode;
	}

	boolean needBill(boolean billRequired) {
		if (billRequired == true) {
			return true;
		}
		return false;
	}

	boolean haveCarryBag(boolean carryBag) {
		if (carryBag == true) {
			return true;
		}
		return false;
	}

	void decideSection() {
		if (itemCount < 10 && payment == "Cash") {
			section = "section 1A";
		} else if (itemCount > 10 && payment == "visa Card") {
			section = "section 1B";
		} else if (itemCount > 10 && payment == "Cash") {
			section = "section 1C";
		} else if (itemCount < 10 && payment == "visa Card") {
			section = "section 1D";

		}

	}

	void displayCustomerInfo() {

		System.out.println(name + " brought " + itemCount + " items and payment done using " + payment + " in " + section);
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Arti");
		mall.itemsAddedToCart(12);
		mall.paymentDoneUsing("visa Card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();

	}

}
