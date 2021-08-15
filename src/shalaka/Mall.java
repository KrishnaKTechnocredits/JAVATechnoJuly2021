package shalaka;

public class Mall {

	int itemAddedToCart(int itemCount) {
		return itemCount;
	}

	String customerName(String custName) {
		return custName;
	}

	String paymentDoneUsing(String paymentMethod) {
		return paymentMethod;
	}

	void displayCutomerInfo(String name, int item, String paymentMode, String sectionName) {
		System.out.println(name + " brought " + item + " items and payment done using " + paymentMode + " in section "
				+ sectionName);
	}

	boolean needBill(boolean isBillRequired) {
		if (isBillRequired)
			return true;
		else
			return false;
	}

	boolean haveCarryBag(boolean isCarryBagRequired) {
		if (isCarryBagRequired)
			return true;
		else
			return false;
	}

	String decideSection(int item, String paymentMethod) {
		if (item < 10 && paymentMethod == "cash")
			return "1A";
		else if (item > 10 && paymentMethod == "cash")
			return "1C";
		else if (item < 10 && paymentMethod == "visa card")
			return "1D";
		else if (item > 10 && paymentMethod == "visa card")
			return "1B";
		else
			return "";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall mall = new Mall();
		int item = mall.itemAddedToCart(15);
		String custName = mall.customerName("Shalaka");
		boolean isBillRequired = mall.needBill(true);
		boolean haveCarryBag = mall.haveCarryBag(true);
		String paymentDoneUsing = mall.paymentDoneUsing("cash");
		String decision = mall.decideSection(item, paymentDoneUsing);
		mall.displayCutomerInfo(custName, item, paymentDoneUsing, decision);

	}

}
