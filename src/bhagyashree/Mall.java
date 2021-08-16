package bhagyashree;

public class Mall {
	
	 int itemNumber;
	String custName;
	 String payment;
	boolean bill,carrybag;
	void itemAddedToCart(int noOfItems)
	{
		itemNumber=noOfItems;
		//return itemNumber;
		//System.out.println(itemNumber);
	}
	
	//System.out.println(itemNumber);
	void setCustomer(String cname)
	{
		custName=cname;
		//System.out.println(custName);
	}
	
	void paymentDoneUsing(String payMethod)
	{
		payment=payMethod;
		//return payment;
		//System.out.println(payment);
	}
	
	
	String decideSection()
	{
		if(itemNumber<10 && payment.equals("Cash"))
		
			return "Section 1A";
		
		else if(itemNumber>10 && payment.equals("Visa Card"))
		
			return "Section 1B";
		
		else if(itemNumber>10 && payment.equals("Cash"))
		
			return "Section 1C";
		
		else if(itemNumber<10 && payment.equals("visa card"))
		
			return "Section 1D";
		
		
		return "Details provided incorrect";
		
	}
	
	void needBill(boolean billcopy)
	{
		bill=billcopy;
		System.out.println("Bill Provided");
	}
	
	void haveBag(boolean bag)
	{
		carrybag=bag;
		System.out.println("Bag provided");
	}
	void displayCustomerInfo()
	{
		System.out.println(custName);
		System.out.println(payment);
	}
	public static void main(String[] args)
	{
		Mall mall=new Mall();
		mall.setCustomer("Harsh");
		mall.itemAddedToCart(12);
		
		mall.paymentDoneUsing("Visa card");
		System.out.println(mall.custName +" brought "+mall.itemNumber+" items and payment done using " +mall.payment+" in "+mall.decideSection());	
		mall.displayCustomerInfo();
		//mall.decideSection();
		mall.haveBag(true);
		mall.needBill(true);
		
		
	}
	
}
