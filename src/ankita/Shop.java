package ankita;

public class Shop {
	int maggi=50;
	int dosa=43;
	int pouches=39;
    int panipuri=43;
	int masala=73;
	static int Quantity;

	void Purchase(String item,int quantity) {
		String Item=item;
		int Quantity=quantity;
		 if(Item.equals("maggi"))
		 {
			  maggi=maggi-Quantity;
			 System.out.println("Updated maggi quantity "+maggi);
		 }
		 else if(Item.equals("dosa"))
		 {
			 dosa=dosa-Quantity;
			 System.out.println("Updated dosa quantity "+dosa);
		 }
		 else if(Item.equals("pouches"))
		 {
			  pouches=pouches-Quantity;
			 System.out.println("Updated pouches quantity "+pouches);
		 }
		 else if(Item.equals("panipuri"))
		 {
			 panipuri=panipuri-Quantity;
			 System.out.println("Updated panipuri quantity "+panipuri);
		 }
		 else if(Item.equals("masala"))
		 {
			  masala=masala-Quantity;
			 System.out.println("Updated masala quantity "+masala);
		 }
	}
		 public void stockDetails() 
		 {
			 if(maggi==0)
				 System.out.println("Maggi is out of stock");
			 else
				 System.out.println("Maggi is in stock");
			 if(dosa==0)
				 System.out.println("dosa is out of stock");
			 else
				 System.out.println("dosa is in stock");
			 if(pouches==0)
				 System.out.println("pouches is out of stock");
			 else
				 System.out.println("pouches is in stock");
			 if(panipuri==0)
				 System.out.println("Panipuri is out of stock");
			 else
				 System.out.println("Panipuri is in stock");
			 if(masala==0)
				 System.out.println("Masala is out of stock");
			 else
				 System.out.println("Masala is in stock");
		 }
		 
	
public static void main(String[] args) {
	Shop shop=new Shop();
	shop.Purchase("maggi",50);
	shop.Purchase("dosa",10);
	shop.Purchase("pouches",30);
	shop.Purchase("panipuri",28);
	shop.Purchase("masala",73);
	System.out.println("-------------------");
	shop.stockDetails();
}
}
