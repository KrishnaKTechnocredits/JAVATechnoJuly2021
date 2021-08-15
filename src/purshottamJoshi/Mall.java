package purshottamJoshi;

class Mall{
	int totalItem;
	String customerName;
	String paymentInfo;
	String section;
	int itemAddedToCart(int item) {
		totalItem = item;
		return totalItem;
	}
	void setName(String custname) {
		customerName=custname;
	}
	String paymentDoneUsing(String payment){
		paymentInfo = payment;
		return paymentInfo;
		
	}
	void displayCutomerInfo(String section) {
		System.out.println(customerName + " brought " + totalItem + " product and payment done using " + paymentInfo+ " in " + section);
	}
	void needBill(boolean bill) {
		if(bill) {
			System.out.println(customerName+" Please Collect your bill");
		}
	}
	void haveCarryBag(boolean carryBag) {
		if(carryBag) {
			System.out.println("5 rs charged for carrybag");
		}
	}
	String decideSection(String payment) {
		if (totalItem < 10 & paymentInfo.equals("cash")) {
			String section = "Section 1A";
			return section;
		} else if (totalItem > 10 & paymentInfo.equals("visa")) {
			String section = "Section 1B";
			return section;
		} else if (totalItem > 10 & paymentInfo.equals("cash")) {
			String section = "Section 1C";
			return section;
		}
		return "section 1D";
	}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.setName("Purshottam");
		mall.itemAddedToCart(12);
		mall.haveCarryBag(true);
		mall.needBill(true);
		String payment = mall.paymentDoneUsing("cash");
		String section = mall.decideSection(payment);
		mall.displayCutomerInfo(section);
		
	}
}