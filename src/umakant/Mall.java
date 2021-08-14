/*
 * 1. Create a class named as Mall, which contains below methods
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

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameterpackage umakant;
*/
package umakant;

public class Mall {

	int itemsCount;
	String customerName;
	String paymentMethod;
	boolean billNeeded;
	boolean carryBagNeeded;
	String section;

	void itemAddedToCart(int items) {
		if (items > 0)
			itemsCount = items;
		else
			System.out.println("Number of items must be greater than zero");

	}

	void setCustomerName(String name) {
		customerName = name;
	}

	void setPaymentMethod(String paymentType) {
		if (paymentType.equals("Cash") || paymentType.equals("Visa Card"))
			paymentMethod = paymentType;
		else
			System.out.println("We only accept payment in Cash or Visa Card. Please change payment method");
	}

	void isCarryBagNeeded(boolean carryBag) {
		carryBagNeeded = carryBag;
	}

	void isBillNeeded(boolean bill) {
		billNeeded = bill;
	}

	void displayCustomerInfo() {
		if (carryBagNeeded && billNeeded)
			System.out.println(customerName + " brought " + itemsCount
					+ " items along with carrybag and payment done using " + paymentMethod + " in section "
					+ decideSection() + ". Also customer requested for the bill");
		else if ((!carryBagNeeded) && billNeeded)
			System.out.println(customerName + " brought " + itemsCount
					+ " items without carrybag and payment done using " + paymentMethod + " in section "
					+ decideSection() + ". Also customer requested for the bill");
		else if (carryBagNeeded && !billNeeded)
			System.out.println(customerName + " brought " + itemsCount
					+ " items along with carrybag and payment done using " + paymentMethod + " in section "
					+ decideSection() + ". Also customer not requested for the bill");
		else
			System.out.println(customerName + " brought " + itemsCount
					+ " items without carrybag and payment done using " + paymentMethod + " in section "
					+ decideSection() + ". Also customer not requested for the bill");
	}

	String decideSection() {
		if (itemsCount < 10 && paymentMethod.equals("Cash"))
			return "1A";
		else if (itemsCount > 10 && paymentMethod.equals("Visa Card"))
			return "1B";
		else if (itemsCount > 10 && paymentMethod.equals("Cash"))
			return "1C";
		else
			return "1D";
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.setCustomerName("Umakant");
		mall.itemAddedToCart(12);
		mall.isCarryBagNeeded(true);
		mall.isBillNeeded(true);
		mall.setPaymentMethod("Visa Card");
		mall.displayCustomerInfo();
	}
}
