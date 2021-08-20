package somnath;
public class Assignment_12_Mall 
{	
	String custName;
	String paymentBy;
	int itemsadded = 0;

	void setCustomerDetails(String name)
	{
		custName= name;
	}

	int itemsAddedToCart(int items)
	{
		itemsadded += items;
		return itemsadded;
	}

	String paymentDoneUsing(String paidBy)
	{

		if(paidBy.equals("CASH"))
		{
			paymentBy = paidBy;
			return paidBy;
		}
		else if(paidBy.equals ("VISA CARD"))
		{
			paymentBy = paidBy;
			return paidBy;
		}
		else

			System.out.println("Invalid payment type");

		return null;


	}

	boolean needBill(boolean status)
	{
		if(status)
		{
			System.out.println("Here is your bill Thank you.");
			return true;
		}
		else
			System.out.println("Hey " + custName + " lets Save paper & Save Environment.");
		return false;
	}

	boolean needCarryBags(boolean status)
	{
		if(status)
		{
			System.out.println("Here is your carry bag.");
			return true;
		}
		else
			System.out.println("Great " + custName + " No Carry bag Required.");
		return false;
	}

	String decideSection()
	{
		if (itemsadded>0)
		{
			if(itemsadded<10 && paymentBy.equals("CASH"))
				return "C1";
			else if(itemsadded>=10 && paymentBy.equals("VISA CARD"))
				return "C2";
			else if(itemsadded>=10 && paymentBy.equals("CASH"))
				return "C3";
			else if (itemsadded<10 && paymentBy.equals("VISA CARD"))
				return "C4";
		}
		return null;
	}

	void displayCustomerInfo()
	{
		System.out.println(custName + " bought " + itemsadded + " items and payment is done using " + 
							paymentBy + " in section " + decideSection());
	}

   public static void main(String[] as)
   {
	   Assignment_12_Mall mall_1 = new Assignment_12_Mall();
	   System.out.println("***********************************------******************************************");
	   mall_1.setCustomerDetails("Bhupesh");
	   mall_1.itemsAddedToCart(11);
	   mall_1.paymentDoneUsing("CASH");
	   mall_1.displayCustomerInfo();
	   mall_1.needBill(true);
	   mall_1.needCarryBags(false);
	   System.out.println("********************************----------********************************************");

	   Assignment_12_Mall mall_2 = new Assignment_12_Mall();
	   mall_2.setCustomerDetails("Abhilash");
	   mall_2.itemsAddedToCart(28);
	   mall_2.itemsAddedToCart(-10);
	   mall_2.paymentDoneUsing("VISA CARD");
	   mall_2.displayCustomerInfo();
	   mall_2.needBill(false);
	   mall_2.needCarryBags(true);
	   System.out.println("*********************************--------***********************************************");

	   Assignment_12_Mall mall_3 = new Assignment_12_Mall();
	   mall_3.setCustomerDetails("Vishal");
	   System.out.println(mall_3.custName + " has bought " + mall_3.itemsAddedToCart(9) +" items And  Payment is done using "+
			   			  mall_3.paymentDoneUsing("VISA CARD") +" in Section "+ mall_3.decideSection());
	   mall_3.needBill(false);
	   mall_3.needCarryBags(false);
	   System.out.println("************************************-----**************************************");
	   mall_3.paymentDoneUsing("VISCARD");
	   System.out.println("************************************-----****************************************");
   }
}

 