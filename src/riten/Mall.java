package riten;

class Mall {

	int item;
	String firstName;
	String paymentMode;
	String payment1 = "visa card";
	String payment2 = "Cash";

	void mallCustomerEntry(String firstName,int item,String paymentMode) {
		
		if (payment2==paymentMode) {
			if (item < 10) {
				System.out.println(firstName+" brought " + item + " items and payment done using " +paymentMode+ " in section 1A");
			} else if (item > 10) {
				System.out.println(firstName+" brought " + item + " items and payment done using " +paymentMode+ " in section 1C");

			}

		} else if (payment1==paymentMode) {
			if (item > 10) {
				System.out.println(firstName+" brought " + item + " items and payment done using " +paymentMode+ " in section 1B");
			} else if (item < 10) {
				System.out.println(firstName+" brought " + item + " items and payment done using " +paymentMode+ " in section 1D");

			}
		} else {
			System.out.println("Thank you for coming");
		}
		
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.mallCustomerEntry("Riten",11,"Cash");
		mall.mallCustomerEntry("Bhagya",9,"Cash");
		mall.mallCustomerEntry("Mihir",12,"visa card");
		mall.mallCustomerEntry("Hridhay",7,"visa card");
	}

}