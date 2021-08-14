package amol_Pawar;

public class Assignment_12 {
	String firstName;
	
	String cardType;
	int totalItem;
	String Section;

	int itemAddedToCart(int item) {

		totalItem = item;
		return totalItem;
	}

	void customerName(String name) {
		firstName = name;		
	}

	String paymentDoneUsing(String card) {
		cardType = card;
		return cardType;
	}

	void displayCutomerInfo(String section) {
		System.out.println(firstName + " Has bought " + totalItem + " product and payment done using " + cardType
				+ " in " + section);
	}

	void needBill(boolean bill) {
		if (bill) {
			System.out.println("Thank you "+firstName+", Please collect your bill copy");
		}
	}

	void haveCarryBag(boolean carryBag) {
		if (carryBag) {
			System.out.println("Extra 10 rs need to pay for carrybag");
		}
	}

	String decideSection(String card) {
		if (totalItem < 10 & cardType.equals("cash")) {
			String section = "Section 1A";
			return section;
		} else if (totalItem > 10 & cardType.equals("visa")) {
			String section = "Section 1B";
			return section;
		} else if (totalItem > 10 & cardType.equals("cash")) {
			String section = "Section 1C";
			return section;
		}
		return "section 1D";
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.customerName("Amol");
		assignment_12.itemAddedToCart(12);
		String card = assignment_12.paymentDoneUsing("visa");
		String section = assignment_12.decideSection(card);
		assignment_12.displayCutomerInfo(section);
		assignment_12.haveCarryBag(true);
		assignment_12.needBill(true);
		System.out.println("------New cust Bill--------");
		Assignment_12 assignment_12_2 = new Assignment_12();
		assignment_12_2.customerName("Harsh");
		assignment_12_2.itemAddedToCart(17);
		String card2 = assignment_12_2.paymentDoneUsing("cash");
		String section2 = assignment_12_2.decideSection(card2);
		assignment_12_2.displayCutomerInfo(section2);
		assignment_12_2.haveCarryBag(false);
		assignment_12_2.needBill(true);
		
	}

}
