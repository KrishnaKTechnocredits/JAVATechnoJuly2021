package kumar_Ashish;

class Mall{
	
	String custName;
	String paymentGateway;
	int noOfItems;
	String section;
	
	//Constant
	void itemAddedToCart(int items){
		noOfItems = items;	

	}
	//Constant
	void customerName(String name){
		custName = name;	
	}
	
	//Constant
	void paymentDoneUsing(String pymntGtway)
	{
		paymentGateway = pymntGtway;
		//if(paymentGateway.equals(pymntGtway))
	}
	
	//Constant. Just add Section Type.
	void displayCutomerInfo(){
		System.out.println (custName + " brought " + noOfItems + " items and payment done using " + paymentGateway + " in section " + section );
	
	}
	
	void needBill(Boolean nb){}
	void haveCarryBag(Boolean hvCaryBag){}
	
	
	//if(noOfItems <=10 && paymentGateway.equals("cash"))
	void decideSection(){
		
		if(noOfItems <=10)
		{
			if(paymentGateway.equals("cash"))
				section = "1A";	
			else if(paymentGateway.equals("visa"))
					section = "1D";	
		}
		else 
		{
			if(paymentGateway.equals("cash"))
				section = "1C";	
			else if(paymentGateway.equals("visa"))
					section = "1B";	
		}
		
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Ashish"); // 
		mall.itemAddedToCart(16);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.displayCutomerInfo();
	
	
	}

	





}