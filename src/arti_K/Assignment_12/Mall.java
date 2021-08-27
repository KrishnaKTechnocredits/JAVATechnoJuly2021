package arti_K.Assignment_12;

public class Mall {

	String customerName;
	int item;
	String payment;
	boolean billreceipt;
	boolean carrybag;
	String section;
	
	void custName(String name){
		customerName = name;
	}
	
	int itemAddedToCart(int itemcount){
		item = itemcount;
		return item;
	}

	String paymentDoneUsing(String paymentmethod){
		payment = paymentmethod;
		return payment;
	}

	boolean needBill(boolean bill){
		billreceipt = bill;
		return billreceipt;
	}

	boolean haveCarryBag(boolean carrybagstatus){
		carrybag = carrybagstatus;
		return carrybag;
	}
	
		void decideSection(){
		if(item < 10 && payment.equals("Cash"))
			section = "1A";
			
		else if(item > 10 && payment.equals("Cash"))
			section = "1C";
			
		else if(item < 10 && payment.equals("VISA Card"))
			section = "1D";
			
		else if(item > 10 && payment.equals("VISA Card"))
			section = "1B";
		else
			System.out.println("Invalid payment type. Please do the payment via VISA card or Cash.");
	}
	
	void displayCutomerInfo(){
		
		if(payment.equals("Cash") && payment.equals("VISA Card"))
			System.out.println(customerName+ " bought "+item+" items and payment done using "+payment+" in section "+section+".");
		else
			System.out.println(customerName+ " bought "+item+" items and we are waiting for the payment.");
		
		if(billreceipt && carrybag)
			System.out.println("Customer has requested for Bill Receipt and Carray Bag.");
		else if(billreceipt)
			System.out.println("Customer has requested for Bill Receipt.");
		else if(carrybag)
			System.out.println("Customer has requested for Carray Bag.");
		else
			System.out.println("Customer has not requested for Bill Receipt and Carray Bag.");
	}


	public static void main(String[] args) {
		Mall m1 = new Mall();
		System.out.println("----------------- Customer 1 -----------------");
		m1.custName("Aarti");
		m1.itemAddedToCart(12);
		m1.paymentDoneUsing("Cash");
		m1.decideSection();
		m1.needBill(true);
		m1.haveCarryBag(true);
		m1.displayCutomerInfo();
		System.out.println("\n----------------- Customer 2 -----------------");
		Mall m2 = new Mall();
		m2.custName("Sarika");
		m2.itemAddedToCart(5);
		m2.paymentDoneUsing("Cash");
		m2.decideSection();
		m2.needBill(true);
		m2.haveCarryBag(false);
		m2.displayCutomerInfo();
		System.out.println("\n----------------- Customer 3 -----------------");
		Mall m3 = new Mall();
		m3.custName("karan");
		m3.itemAddedToCart(5);
		m3.paymentDoneUsing("VISA Card");
		m3.decideSection();
		m3.needBill(false);
		m3.haveCarryBag(true);
		m3.displayCutomerInfo();
		System.out.println("\n----------------- Customer 3 -----------------");
		Mall m = new Mall();
		m.custName("karan");
		m.itemAddedToCart(15);
		m.paymentDoneUsing("VISA Card");
		m.decideSection();
		m.needBill(false);
		m.haveCarryBag(true);
		m.displayCutomerInfo();
		System.out.println("\n----------------- Customer 4 -----------------");
		Mall m4 = new Mall();
		m4.custName("Smita");
		m4.itemAddedToCart(5);
		m4.paymentDoneUsing("VISA Card");
		m4.decideSection();
		m4.needBill(false);
		m4.haveCarryBag(false);
		m4.displayCutomerInfo();
		System.out.println("\n----------------- Customer 5 -----------------");
		Mall m5 = new Mall();
		m5.custName("Smita");
		m5.itemAddedToCart(5);
		m5.paymentDoneUsing("Rupay card");
		m5.decideSection();
		m5.needBill(false);
		m5.haveCarryBag(true);
		m5.displayCutomerInfo();
	}

}
