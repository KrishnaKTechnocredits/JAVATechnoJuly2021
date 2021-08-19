package shreya;

public class Mallshopping {
	int items;
	String customername;
	String payemntMode;
	int itemAddedToCart(int itemValue) {
		items=itemValue;
		return items;
	}
	
	String customername(String name) {
		customername=name;
		return name;
	}
	
	String paymentDoneUsing(String payment) {
		payemntMode=payment;
		return payment;
	}
	
	
	boolean needBill(boolean bill) {
		if(bill==true) {
			System.out.println("Bill generated");
		}else {
			System.out.println("No need to generate the bill");
		}
		return bill;
	}
	
	boolean haveCarryBag(boolean haveCarryBag) {
		if(haveCarryBag==true) {
			System.out.println("Extra cost will be charged");
		}else {
			System.out.println("No extra cost will be charged");
		}
		return haveCarryBag;
	}
	void displayCustomerInfo() {
		System.out.println(customername+" has brought "+items+" items and payment done using "+payemntMode+" in section "+decideSection());
	}
   String decideSection() {
	   if(items<10 && payemntMode=="cash")
			return "1A" ;
		if(items>10 && payemntMode=="visa card")
			return "1B";
		if(items>10 && payemntMode=="cash")
			return "1C";
		if(items<10 && payemntMode=="visa card")
			return "1D";
	
		return null;
   }
	public static void main(String[] args) {
		Mallshopping mall=new Mallshopping();
		mall.customername("Unnati");
        mall.itemAddedToCart(12);
        mall.paymentDoneUsing("visa card");
        mall.displayCustomerInfo();
        mall.customername("Mitali");
        mall.itemAddedToCart(10);
        mall.paymentDoneUsing("cash");
        mall.displayCustomerInfo();
	}

}
