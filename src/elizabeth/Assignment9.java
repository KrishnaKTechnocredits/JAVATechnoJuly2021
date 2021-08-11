/*Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of oilPouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/

package elizabeth;
class Assignment9{
	
	int maggieCount;
	int dosaCount;
	int oilPouchesCount;
	int panipuriCount;
	int masalaCount;
	
	void inStock(int maggie,int dosa,int oilPouches,int panipuri,int masala){
		
		maggieCount=maggie;
		dosaCount=dosa;
		oilPouchesCount=oilPouches;
		panipuriCount=panipuri;
		masalaCount=masala;	
	}

	void itemQuantity(int orderMaggie,int orderDosa,int orderOilPouches,int orderPanipuri,int orderMasala){
		System.out.println("MAGGIE:");
		if(orderMaggie<=maggieCount){
			int remainingQuantity=maggieCount-orderMaggie;
			System.out.println("Maggies are available in stock");
			System.out.println("After selling remaining stock is " +remainingQuantity);
			
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("DOSA:");
		if(orderDosa<=dosaCount){
			int remainingQuantity=dosaCount-orderDosa;
			System.out.println("Dosas are available in stock");
			System.out.println("After selling remaining stock is " +remainingQuantity);
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("OIL POUCHES:");
		if(orderOilPouches<=oilPouchesCount){
			int remainingQuantity=oilPouchesCount-orderOilPouches;
			System.out.println("Oil Pouches are available in stock");
			System.out.println("After selling remaining stock is " +remainingQuantity);
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("PANIPURI:");
		if(orderPanipuri<=panipuriCount){
			int remainingQuantity=panipuriCount-orderPanipuri;
			System.out.println("Panipuries are available in stock");
			System.out.println("After selling remaining stock is " +remainingQuantity);
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("MASALA:");
		if(orderMasala<=masalaCount){
			int remainingQuantity=masalaCount-orderMasala;
			System.out.println("Masalas are available in stock");
			System.out.println("After selling remaining stock is " +remainingQuantity);
		}else{
			System.out.println("running out of stock");
		}
	}
	
	public static void main(String[] args){
		Assignment9 assignment9=new Assignment9();
		assignment9.inStock(50,43,39,43,73);
		assignment9.itemQuantity(20,30,40,30,50);
	}
	
	
}