package ankita;

public class Mall {
	String fname;
	int start;
	int quantity;
	String ptype;
	
	void customerName(String fname) 
	{
		String name=fname;
		System.out.println(name + " brought");
	}
	
	void itemAddedToCart(int qty)
	{
		 quantity=qty;
		System.out.println(qty + "  Items");
		
				
	}
	
	public void paymentOption(String start) 
	{
		
		if(start.equals("Cash")) {
			System.out.println("payment done by Cash");
			ptype="Cash";
		}else if(start.equals("Card")) 
			{
			System.out.println("payment done by visa card");
			ptype="Card";
		}
		
	}
	
	public void decideSection() 
	{
		if(quantity<10 && ptype.equals("Cash"))
		{
			
			System.out.println("in section 1A cash");
		}
		
		else if(quantity>10 && ptype.equals("Cash"))
		{
			System.out.println("in section 1C cash");
		}
		else if(quantity>10 && ptype.equals("Card")) 
		{
			
			System.out.println("in section 1B card");
		}
		else if(quantity<10 && ptype.equals("Card")) 
		{
			System.out.println("in section 1D card");
		}
	}
	
	boolean needBill(boolean flag) {
		return flag=true;
	}
		
	boolean needCarryBag(boolean flag) {
		return flag=true;
	}
	    
	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.customerName("Ram");
		
		mall.itemAddedToCart(15);
		mall.paymentOption("Card");
		mall.decideSection();
		
	
	}
}

	
