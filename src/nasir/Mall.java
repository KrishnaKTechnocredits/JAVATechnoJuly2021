/*Create a class named as Mall, which contains below methods
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

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter*/

package nasir;

public class Mall {
	String customer;
	String paymentType;
	int totalItem;

	public void itemAddedToCart(int item) {
		System.out.println(item + " item added successfully");
		totalItem = item;
	}

	public void customerName(String customerN) {
		customer = customerN;
	}

	public String paymentDoneUsing(String paymentMethod) {
		paymentType = paymentMethod;
		return paymentType;

	}

	public void displayCustomerInfo(String section) {
		System.out.println(customer + " bought " + totalItem + " items and payment done using " + paymentType
				+ " in " + section);
	}

	public void needBill(boolean bill) {
		if (bill) {
			System.out.println("Thank you , Please collect your bill copy");
		}
	}

	public void haveCarryBag(boolean carryBag) {
		if (carryBag) {
			System.out.println("Extra 2 rs need to pay for carrybag");
		}
	}

	public String decideSection(String payment) {
		if (totalItem < 10 && paymentType.equals("cash")) {
			String section = "Section 1A";
			return section;
		} else if (totalItem > 10 & paymentType.equals("visa")) {
			String section = "Section 1B";
			return section;
		} else if (totalItem > 10 & paymentType.equals("cash")) {
			String section = "Section 1C";
			return section;
		}
		return "section 1D";
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Nasir");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa");
		String payment = mall.paymentDoneUsing("visa");
		String section = mall.decideSection(payment);
		mall.displayCustomerInfo(section);
		mall.haveCarryBag(true);
		mall.needBill(true);
		Mall mall_1 = new Mall();
		System.out.println("--------------------------------------------------------");
		mall_1.customerName("harry");
		mall_1.itemAddedToCart(10);
		mall_1.paymentDoneUsing("cash");
		String payment2 = mall_1.paymentDoneUsing("card");
		String section_1 = mall_1.decideSection(payment2);
		mall_1.displayCustomerInfo(section_1);
		mall_1.haveCarryBag(false);
		mall_1.needBill(false);
	}

}
