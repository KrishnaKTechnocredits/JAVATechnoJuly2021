package jagrati;

public class Assignment_12 {
	
	String customerName;
	int itemValue;
	String card;
	boolean flag;
	boolean haveCarryBag;
	String section;
	
	 void itemAddedToCart(int iteamQty) {
		itemValue = iteamQty;
	
	 }void customerName(String cusName){
		 customerName =cusName;
	 
	 }String paymentDoneUsing(String cardType){
		 card = cardType;
		 if (cardType == "Visa Card") {
				return cardType;
	 } else if (cardType == "Cash") {
				return cardType;
	}  else  
		return "Invalid method applied ";  
		
	 }void dispayInfo(){
			 System.out.println(customerName + " brought "+itemValue+" payment done using "+ card + " in section "+section);
			 
	  }void decideSection(String sec){
		  section = sec;
			 if ( itemValue <10 && card == "cash") {
				 flag= true;
				 System.out.println("1A" + sec);
			 }else if (itemValue >10 && card == "Visa Card"){
				 flag = true;
				 System.out.println("1B" + sec);
			 }else if (itemValue >10 && card == "cash") {
				 flag = true;
				 System.out.println("1C" + sec); 
			 }else if (itemValue < 10 && card == "Visa Card") {
				 flag = true;
				 System.out.println("1D");
			 }
		
						 
			 
		 } boolean needBill(boolean flag) {
			 if (flag) {
				 System.out.println("customer bill required" );
				 return true; 
			 }System.out.println("bill not required");
			return false;
		 }
		 
		 boolean haveCarryBag(boolean flag) {
			 if (itemValue > 10 && flag) {
				 flag = true;
				 System.out.println("Carry bag issue to cosutomer");
			 } if (itemValue < 10 && flag)
				 System.out.println("Carry Bag not issue to customer");
			return false;
			
		 }
	  
	  public static void main (String []args) {
			 Assignment_12 assignment_12 = new Assignment_12();
			 assignment_12.customerName("Harsh");
			 assignment_12.itemAddedToCart(12);
			 assignment_12.paymentDoneUsing("Visa card");
			 assignment_12.decideSection("1B");
			 assignment_12.dispayInfo();
			 assignment_12.needBill(true);
			 assignment_12.haveCarryBag(true);
		 }
		 
	 }


