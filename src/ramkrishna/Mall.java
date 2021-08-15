package ramkrishna;

public class Mall {

	int itemAddedToCart(int item) {

		return item;
	}

	String cutomerName(String Name) {

		return Name;

	}

	String paymentDoneUsing(String payment) {

		return payment;
	}

	void displayCustomerInfo(String name, int item, String payment, String section) {

		System.out.println(
				name + " brought  " + item + " item and payment done using " + payment + " in section" + section);
	}

	boolean needBill(boolean bill) {
		return bill;
	}

	boolean haveCarryBag(boolean haveBag) {

		return haveBag;
	}

	String decideSection(int item, String payment) {
		if (item < 10 && payment.equals("Cash")) {
			return "1A";
		} else if (item > 10 && payment.equals("Visacard")) {
			return "1B";
		} else if (item > 10 && payment.equals("Cash")) {
			return "1C";
		} else 
			return "1D";
		}


	public static void main(String[] arg) {

		Mall mall = new Mall();
		int item = mall.itemAddedToCart(5);
		String name = mall.cutomerName("Ramrkrishna");
		String payment = mall.paymentDoneUsing("visaCard");
		String section = mall.decideSection(item, payment);
		mall.displayCustomerInfo(name, item, payment, section);
		mall.needBill(false);
		mall.haveCarryBag(false);
	}
}
