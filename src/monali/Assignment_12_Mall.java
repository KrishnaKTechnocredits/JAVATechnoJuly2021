
package monali;

public class Assignment_12_Mall {

	String custName;
	int itemsInCart;
	String paymentMode;
	

	int itemAddedToCart(int cartQuanltity) {
		itemsInCart = cartQuanltity;
		return itemsInCart;
	}

	void customerName(String name) {
		custName = name;
	}

	String paymentDoneUsing(String paymtOption) {
		paymentMode = paymtOption;
		return paymentMode;
	}

	void displayCutomerInfo() {
		System.out
				.println(custName + " bought " + itemsInCart + " items and payment done using " + paymentMode + " in ");
		decideSection();
	}

	boolean needBill(boolean billRequired) {

		if (billRequired)
			System.out.println(custName + " required bill");
		else
			System.out.println(custName + " does not required bill");

		return billRequired;
	}

	boolean haveCarryBag(boolean needBag ) {
		if (needBag)
			System.out.println(custName + " need a carry bag and has to pay 10 rs more");
		else
			System.out.println(custName + " does not required carry bag ");
		return needBag;
	}

	void decideSection() {
		if (itemsInCart < 10 && paymentMode.equals("cash")) {
			System.out.println("Section 1A");
		} else if (itemsInCart > 10 && paymentMode.equals("visa card")) {
			System.out.println("Section 1B");
		} else if (itemsInCart > 10 && paymentMode.equals("cash")) {
			System.out.println("Section 1C");
		}
		else if(itemsInCart < 10 && paymentMode.equals("visa card")) {
			System.out.println("Section 1D");
		}

	}

	public static void main(String[] args) {
		Assignment_12_Mall mall = new Assignment_12_Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
		
		mall.customerName("Monali");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsing("cash");
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();
	}
}
