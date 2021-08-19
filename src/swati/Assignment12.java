package swati;
class Assignment12{
	
	String customerName,paymentMethod,section,billStatus,carryBagStatus;
	int cartValue;
	
	void customerName(String name){
		customerName=name;
	}
		
	void itemAddedToCart(int items){
		cartValue=items;
	}
	
	void paymentDone(String paymentmode){
		 paymentMethod=paymentmode;
	}
		
	String decideSection(){
	
		if(cartValue<10 && paymentMethod.equals("Cash")){
			section="Section 1A";
			return section;
				
		}else if(cartValue>10 && paymentMethod.equals("Cash")){
			section="Section 1C";
			return section;
					
		}else if(cartValue<10 && paymentMethod.equals("Visa card")){
			section="section 1D";
			return section;
		}
		section="section 1B";
		return section;
					
		}
	
	String needBill(boolean status){
		if(status)
			return billStatus="Yes";
		else
			return billStatus="No";
	}
	
	String haveCarryBag(boolean status){
		if(status)
			return carryBagStatus="Yes";
		else
			return carryBagStatus="No";
	}
	
	void displayCutomerInfo(){
		
		System.out.println(customerName+" brought "+ cartValue +" items and payment done using "+paymentMethod+ " in "+section);
		System.out.println("Bill Print Copy Required: " + billStatus);
		System.out.println("CarryBag Required: " + carryBagStatus);
		
	}
	
	public static void main(String a[]){
		Assignment12 assignment12=new Assignment12();
		assignment12.customerName("Harsh");
		assignment12.itemAddedToCart(5);
		assignment12.paymentDone("Cash");
		assignment12.decideSection();
		assignment12.needBill(true);
		assignment12.haveCarryBag(false);
		assignment12.displayCutomerInfo();
	}
}
		