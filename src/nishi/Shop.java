package nishi;

public class Shop {
	
	static int maggieStk;
	static int dosaStk;
	static int pouchesStk;
	static int panipuriStk;
	static int masalaStk;
	
	void setInitQuantity(int maggieStk1,int dosaStk1,int pouchesStk1,int panipuriStk1,int masalaStk1)
	{
		maggieStk=maggieStk1;
		dosaStk=dosaStk1;
		pouchesStk=pouchesStk1;
		panipuriStk=panipuriStk1;
		masalaStk=masalaStk1;
		
	}
	
	void purchase(String pickedItem,int quantity)
	{
		if(pickedItem.equals("Maggie") && maggieStk>=quantity)
			maggieStk=maggieStk-quantity;
		else
		{
			if(maggieStk==quantity)
				System.out.println(pickedItem+" Running out of stock");
		}
		if(pickedItem.equals("Dosa") && dosaStk>=quantity)
			dosaStk=dosaStk-quantity;
		else
		{
			if(dosaStk==quantity)
				System.out.println(pickedItem+" Running out of stock");
		}
		if(pickedItem.equals("Pouches") && pouchesStk>=quantity)
			pouchesStk=pouchesStk-quantity;
		else
		{
			if(pouchesStk==quantity)
				System.out.println(pickedItem+" Running out of stock");
		}
		if(pickedItem.equals("PaniPuri")&& panipuriStk>=quantity)
			panipuriStk=panipuriStk-quantity;
		else
		{
			if(panipuriStk==quantity)
				System.out.println(pickedItem+" Running out of stock");
		}
		
		if(pickedItem.equals("Masala")&& masalaStk>=quantity)
			masalaStk=masalaStk-quantity;
		else
		{
			if(masalaStk==quantity)
				System.out.println(pickedItem+" Running out of stock");
		}
			
	}
	
	void printOutOfStkItem()
	{
		System.out.println("Out of Stock Item are : ");
		if(maggieStk==0)
			System.out.println("Maggie");
		if(dosaStk==0)
			System.out.println("Dosa");
		if(pouchesStk==0)
			System.out.println("Pouches");		
		if(panipuriStk==0)
			System.out.println("Panipuri");
		if(masalaStk==0)
			System.out.println("Masala");
	}
	
	void printAvailableItem()
	{
		System.out.println("Available Items are :");
		if(maggieStk>0)
			System.out.println("Maggie : "+maggieStk);
		if(dosaStk>0)
			System.out.println("Dosa : "+dosaStk);
		if(pouchesStk>0)
			System.out.println("Pouches : "+pouchesStk);		
		if(panipuriStk>0)
			System.out.println("Panipuri : "+panipuriStk);
		if(masalaStk>0)
			System.out.println("Masala : "+masalaStk);
	}
	
	

	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.setInitQuantity(50,43,39,43,73);
		shop.purchase("Maggie",10);
		shop.purchase("Dosa",20);
		shop.purchase("Pouches",30);
		shop.purchase("PaniPuri",40);
		shop.purchase("Masala",70);
		shop.printAvailableItem();
		shop.purchase("PaniPuri",3);
		shop.printOutOfStkItem();
		shop.printAvailableItem();

	}

}
