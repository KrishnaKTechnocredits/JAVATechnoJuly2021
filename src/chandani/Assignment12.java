package chandani;

class  Assignment12{

	int itemAddedToCart(int item ){
		return item;
	}
	
	String customerName(String custName){
		return custName;
	}
	
	String paymentDoneUsing(String modeOfpayment){
		return modeOfpayment;
	}
	
	void displayCutomerInfo(String Name, int item, String paymentMode, String section ){
		
		System.out.println(Name +" brought " +item +" items and payment done using " +paymentMode +" in section " +section);
		
	}
	
	boolean needBill(boolean needBill){
		return needBill;
		
	}
	
	boolean  haveCarryBag(boolean haveCarryBag){
		return haveCarryBag;
	}
	
	String decideSection(int items, String paymode){
		if (items < 10 && paymode.equals("Cash"))
			return "1A";
		else if (items > 10 && paymode.equals("Visa Card"))
			return "1B";
		else if (items > 10 && paymode.equals("Cash"))
			return "1C";
		else if (items < 10 && paymode.equals("Visa Card"))
			return "1D";
		else
			return "";
		
	}

	public static void main(String[] args){
		Assignment12 mall = new Assignment12();
		int item = mall.itemAddedToCart(12);
		String custName = mall.customerName("Chandani");
		String modeOfpayment = mall.paymentDoneUsing("Visa Card");
		mall.haveCarryBag(true);
		mall.needBill(true);
		String decision = mall.decideSection(item,modeOfpayment);
		mall.displayCutomerInfo(custName, item, modeOfpayment, decision);	

		Assignment12 mall1 = new Assignment12();
		int item1 = mall1.itemAddedToCart(25);
		String custName1 = mall1.customerName("Krishna");
		String modeOfpayment1 = mall1.paymentDoneUsing("Cash");
		mall1.haveCarryBag(false);
		mall1.needBill(true);
		String decision1 = mall1.decideSection(item1,modeOfpayment1);
		mall1.displayCutomerInfo(custName1, item1, modeOfpayment1, decision1);
		
		Assignment12 mall2 = new Assignment12();
		int item2 = mall2.itemAddedToCart(9);
		String custName2 = mall1.customerName("Astha");
		String modeOfpayment2 = mall1.paymentDoneUsing("Visa Card");
		mall2.haveCarryBag(false);
		mall2.needBill(true);
		String decision2 = mall1.decideSection(item2,modeOfpayment2);
		mall2.displayCutomerInfo(custName2, item2, modeOfpayment2, decision2);	
			
	}
}