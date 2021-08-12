//Assignment - 9 : 11th Aug'2021

//Create a system (Shop) which maintains each item's quantity.

//a. Initial stocks of Maggie: 50 Maggie packets 
//b. Initial stocks of Dosa : 43 packets 
//c. Initial stocks of pouches : 39 oil packets 
//d. Initial stocks of panipuri : 43 packets  
//e. Initial stocks of masala’s : 73 packets.

//Expectation:
//1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
//2) Create a method which shows only those item which is "Out of stock".
//3) Create a method which shows only those item which is "Available in stock" & respective quantities.


package chaitanya;

public class Ass9shop {
	
	static int cmaggie = 50;
	static int cdosa = 43;
	static int cpouches = 39;
	static int cpanipuri = 43;
	static int cmasala = 73;
	
	void shopping(int smaggie, int sdosa,int spouches, int spanipuri, int smasala) {
		cmaggie = cmaggie - smaggie;
		cdosa = cdosa - sdosa;
		cpouches = cpouches - spouches;
		cpanipuri = cpanipuri -spanipuri;
		cmasala = cmasala - smasala;
	}
	
	static void oos() {
		 if (cmaggie == 0)
			 System.out.println("Maggie is out of Stock");
		 if (cdosa == 0)
			 System.out.println("Dosa is out of Stock");
		 if (cpouches==0)
			 System.out.println("Pouches is out of Stock");
		 if (cpanipuri==0)
			 System.out.println("Panipuri is out of Stock");
		 if (cmasala==0)
			 System.out.println("Masala is out of Stock");
	}
	
	static void as() {
		if (cmaggie != 0)
			 System.out.println("Maggie is Available in Stock ; " + "Quantity : " + cmaggie );
		 if (cdosa != 0)
			 System.out.println("Dosa is Available in Stock ; " + "Quantity : " + cdosa);
		 if (cpouches!=0)
			 System.out.println("Pouches is Available in Stock ; " + "Quantity : " + cpouches);
		 if (cpanipuri!=0)
			 System.out.println("Panipuri is Available in Stock ; " + "Quantity : " + cpanipuri);
		 if (cmasala!=0)
			 System.out.println("Masala is Available in Stock ; " + "Quantity : " + cmasala);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass9shop ass9shop = new Ass9shop();
		ass9shop.shopping(40, 43 , 15 , 42 , 73);
		Ass9shop.oos();
		Ass9shop.as();
	}

}
