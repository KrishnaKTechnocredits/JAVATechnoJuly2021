package manaswi;

public class Assignment_12
{
	String custName;
	boolean itemlessThan10;
	boolean needBill;
	int totalItem;
	String userPaymentMethod;
	String section; 
	boolean needCarryBag;

	void setCustomerName(String name) 
	{
		custName= name;
	}

	void itemAddedToCart(int item )
	{
		totalItem=item;
		if (totalItem <=0)
		{
			System.out.println("Enter valid item");			
		}
		else if (totalItem <=10)
		{
			itemlessThan10 = true;
		}
		else 
		itemlessThan10 =false;	
	}

	void haveCarryBag(String carrybag)
	{
		if (carrybag.equals("Yes"))
		needCarryBag=true;
		else if (carrybag.equals("No")) 
			needCarryBag=false;	


	}
	void paymentDoneUsing(String paymentMethod)
	{
//		if (!paymentMethod.equals("Cash") || !paymentMethod.equals("Card"))
		{
//			System.out.println("Not valid Payment method");
		}

		userPaymentMethod=paymentMethod;
	}

	void decideSection()
	{

		if (itemlessThan10==true && userPaymentMethod.equals("Cash") )
		{
			section= "1A";
		}
		else if (itemlessThan10==false && userPaymentMethod.equals("Cash") )
		{
			section= "1C";
		}else if (itemlessThan10==false && userPaymentMethod.equals("Card") )
		{
			section= "1D";
		}else if (itemlessThan10==true && userPaymentMethod.equals("Card") )
		{
			section= "1B";
		}else 
		{
			System.out.println("Invalid payment method");
			section= "invalid section";
		}
	}

	void needBill(String billstatus)
	{
		if (billstatus.equals("Yes"))
			needBill=true;
		else if (billstatus.equals("No")) 
		{
			needBill=false;
		}else 
			System.out.println("Bill status is not yet mentioned ");
	}

	void displayCutomerInfo() 
	{
		if (needBill==false) 
		{
			System.out.println(custName+" Customer do not need bill");
		}
		else 
		{
			System.out.println(custName+ "  brought "+totalItem+ " items and payment done using "+userPaymentMethod+ " in section " +section);
		}
	}

	public static void main (String[] df)
	{
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.setCustomerName("Manswi");
		assignment_12.itemAddedToCart(15);
		assignment_12.paymentDoneUsing("Cash");
		assignment_12.needBill("Yes");
		assignment_12.decideSection();
		assignment_12.displayCutomerInfo();	

	}
}