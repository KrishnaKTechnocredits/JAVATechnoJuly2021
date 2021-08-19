package rasika;


class Assignment12{
	
	int itemCount;
	String payment;
	String Name;
	String section;

	void itemAddedToCart(int count){
		itemCount=count;
	}
	
	void customerName(String custName){
		Name=custName;
	}
	
	void paymentDoneUsing(String paymentMode){
		payment=paymentMode;
	}
	
	boolean needBill(boolean billRequired){
		if(billRequired==true){
			return true;
		}
		return false;
	}
	
	boolean haveCarryBag(boolean carryBagRequired){
		if(carryBagRequired==true){
			return true;
		}
		return false;
	}
	
	void decideSection(){
		if(itemCount<10 && payment=="Cash"){
			section="section 1A";
		}else if(itemCount>10 && payment=="Visa Card"){
			section="section 1B";
		}else if(itemCount>10 && payment=="Cash"){
			section="section 1C";
		}else if(itemCount<10 && payment=="Visa Card"){
			section="section 1D";
		}
	}
	
	void displayCustomerInfo(){
		System.out.println(Name + " brought " + itemCount + " items and payment done using " + payment + " in " +section);
	}
	
	public static void main(String[]args){
		Assignment12 assignment12=new Assignment12();
		assignment12.itemAddedToCart(20);
		assignment12.customerName("Rasika");
		assignment12.paymentDoneUsing("Cash");
		assignment12.needBill(true);
		assignment12.haveCarryBag(false);
		assignment12.decideSection();
		assignment12.displayCustomerInfo();
		
	}
}
