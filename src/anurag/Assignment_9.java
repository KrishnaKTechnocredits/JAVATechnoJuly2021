package anurag;

public class Assignment_9 {
	
	static int numMaggie=0;
	static int numDosa=43;
	static int numPouches=39;
	static int numPanipuri=43;
	static int numMasala=73;
	
	void outOfStock()
	{
		System.out.println("Out of stock item list");
		
		if(numMaggie==0)
		{
			System.out.println("Maggie");
		}
		if(numDosa==0)
		{
			System.out.println("Dosa");
		}
		if(numPouches==0)
		{
			System.out.println("Oil pouches");
		}
		if(numPanipuri==0)
		{
			System.out.println("Panipuri");
		}
		if(numMasala==0)
		{
			System.out.println("Masala");
		}
	
	}
	void availableStock()
	{
		System.out.println("Available item list");
		if(numMaggie>0)
		{
			System.out.println("Maggies- " +numMaggie);
		}
		if(numDosa>0)
		{
			System.out.println("Dosa- " +numDosa);
		}
		if(numPouches>0)
		{
			System.out.println("Oil pouches- " +numPouches);
		}
		if(numPanipuri>0)
		{
			System.out.println("Panipuri- " +numPanipuri);
		}
		if(numMasala>0)
		{
			System.out.println("Masala- "+numMasala);
		}
		
	}
	void itemPurchase(int maggie,int dosa,int pouches,int puri,int masala)
	{
		if(numMaggie>0)
		{	
		    numMaggie=numMaggie-maggie;
		}
		else
		{
			System.out.println("Maggie out of stocks");
		}
		if(numDosa>0)
		{	
		    numDosa=numDosa-dosa;
		}
		else
		{
			System.out.println("Dosa out of stocks");
		}
		if(numPouches>0)
		{	
		    numPouches=numPouches-pouches;
		}
		else
		{
			System.out.println("Oil pouches out of stocks");
		}
		if(numPanipuri>0)
		{	
		    numPanipuri=numPanipuri-puri;
		}
		else
		{
			System.out.println("Panipuri out of stocks");
		}
		if(numMasala>0)
		{	
		    numMasala=numMasala-masala;
		}
		else
		{
			System.out.println("Masala out of stocks");
		}
	}
	
	public static void main(String[]args)
	{
		Assignment_9 cust1=new Assignment_9();
		cust1.itemPurchase(50,10,20,21,23);
		cust1.outOfStock();
		cust1.availableStock();
	}

}
