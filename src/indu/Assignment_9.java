package indu;

public class Assignment_9
{
	static int maggiePackets = 50;
	static int dosaPackets = 43;
	static int oilPouches = 39;
	static int panipuriPackets = 43;
	static int masalaPackets = 73;
	
	void outOfStockItems()
	{
		System.out.println("Out of stock items are : ");
		
		if(maggiePackets <= 0)
		{
			System.out.println("Maggie is out of Stock");
		}
		if(dosaPackets <= 0)
		{
			System.out.println("Dosa is out of Stock");
		}
		if(oilPouches <= 0)
		{
			System.out.println("Oil Pouche is out of Stock");
		}
		if(panipuriPackets <= 0)
		{
			System.out.println("Panipuri is out of Stock");
		}
		if(masalaPackets <= 0)
		{
			System.out.println("Masala is out of Stock");
		}
		
		System.out.println("................................................");
	}
	
	void inStockItems()
	{
		System.out.println("In stock items are : ");

		if(maggiePackets > 0)
		{
			System.out.println("Maggie in Stock : " + maggiePackets);
		}
		if(dosaPackets > 0)
		{
			System.out.println("Dosa in Stock : " + dosaPackets);
		}
		if(oilPouches > 0)
		{
			System.out.println("Oil Pouche in Stock : " + oilPouches);
		}
		if(panipuriPackets > 0)
		{
			System.out.println("Panipuriin Stock : " + panipuriPackets);
		}
		if(masalaPackets > 0)
		{
			System.out.println("Masala is in Stock : " + masalaPackets);
		}
		
		System.out.println("................................................");

	}
	
	void purhaseItems(int maggie, int dosa ,int oil ,int panipuri ,int masala)
	{
		if(maggie > maggiePackets)
		{
			System.out.println("Maggie is out of stock .");
		}
		else
		{
			maggiePackets = maggiePackets- maggie;
			System.out.println("Maggie purchased : " + maggie);
		}
		
		if(dosa > dosaPackets)
		{
			System.out.println("Dosa is out of stock .");
		}
		else
		{
			dosaPackets = dosaPackets- dosa;
			System.out.println("Dosa purchased : " + dosa);
		}
		
		if(oil > oilPouches)
		{
			System.out.println("Oil is out of stock .");
		}
		else
		{
			oilPouches = oilPouches- oil;
			System.out.println("Oil purchased : " + oil);
		}
		
		if(panipuri > panipuriPackets)
		{
			System.out.println("Panipuri is out of stock .");
		}
		else
		{
			panipuriPackets = panipuriPackets- panipuri;
			System.out.println("Panipuri purchased : " + panipuri);
		}
		
		if(masala > masalaPackets)
		{
			System.out.println("Masala packet is out of stock .");
		}
		else
		{
			masalaPackets = masalaPackets- masala;
			System.out.println("Masala packet purchased : " + masala);
		}
		System.out.println("................................................");

	}
	
	void finalQuantity()
	{
		System.out.println("Final Quantity of Stock : ");
		System.out.println("Maggie   packets : " + maggiePackets);
		System.out.println("Dosa     packets : " + dosaPackets);
		System.out.println("Oil      packets : " + oilPouches);
		System.out.println("Panipuri packets : " + panipuriPackets);
		System.out.println("Masala   packets : " + masalaPackets);		
	}
	
	public static void main(String[] arg)
	{
		Assignment_9 purchaser1 = new Assignment_9();
		System.out.println("Stock Available for Customer_1");
		purchaser1.inStockItems();
		//purchaser1.outOfStockItems();
		purchaser1.purhaseItems(10, 20, 5, 43, 73);
		//purchaser1.finalQuantity();
		
		System.out.println("==================================================");
		
		Assignment_9 purchaser2 = new Assignment_9();
		System.out.println("Stock Available for Customer_2");
		purchaser2.inStockItems();
		purchaser2.outOfStockItems();
		purchaser2.purhaseItems(10, 20, 5, 3, 5);
		purchaser2.finalQuantity();
		
		
	}
}
