package devendra_c;

public class Mall_M12 {
	String fName, cardType, counter;
	int totalItem;

	int itemAddedToCart(int item) {
		totalItem = item;
		return totalItem;
	}

	void customerName(String name) {
		fName = name;		
	}

	String paymentDoneUsing(String card) {
		cardType = card;
		return cardType;
	}

	void displayCutomerInfo(String counter) {
		System.out.println("Mr." +fName+ " bought " +totalItem+ " products and paid using " +cardType+ " on " +counter);
	}

	void needBill(boolean bill) {
		if (bill) {
			System.out.println("Mr." +fName+ ", Please collect your Payment Slip");
			System.out.println("Thank you! Visit Again...");
		}
	}

	void haveCarryBag(boolean carryBag) {
		if (carryBag) {
			System.out.println("Extra Rs.12 need to pay for Carrybag");
		}
	}

	String decideSection(String card) {
		if (totalItem < 10 & cardType.equals("Cash")) {
			String counter = "Counter M(A)";
			return counter;
		} else if (totalItem > 10 & cardType.equals("Visa")) {
			String counter = "Counter M(B)";
			return counter;
		} else if (totalItem > 10 & cardType.equals("Cash")) {
			String counter = "Counter M(C)";
			return counter;
		}
		return "Counter M";
	}

	public static void main(String[] args) {
		System.out.println("------Customer Bill 01--------");
		Mall_M12 mallcounter1 = new Mall_M12();
		mallcounter1.customerName("Deven");
		mallcounter1.itemAddedToCart(5);
		String card = mallcounter1.paymentDoneUsing("Cash");
		String counter = mallcounter1.decideSection(card);
		mallcounter1.displayCutomerInfo(counter);
		mallcounter1.haveCarryBag(true);
		mallcounter1.needBill(true);
		System.out.println("------Customer Bill 02--------");
		Mall_M12 mallcounter2 = new Mall_M12();
		mallcounter2.customerName("DC");
		mallcounter2.itemAddedToCart(15);
		String card2 = mallcounter2.paymentDoneUsing("Visa");
		String section2 = mallcounter2.decideSection(card2);
		mallcounter2.displayCutomerInfo(section2);
		mallcounter2.haveCarryBag(false);
		mallcounter2.needBill(true);
	}
}