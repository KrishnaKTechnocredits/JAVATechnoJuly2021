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
	
	int requestedMaggie;
	int requestedDosa;
	int requestedOilPouches;
	int requestedPanipuri;
	int requestedMasala;
	
	
	void inStock(int maggie,int dosa,int oilPouches,int panipuri,int masala){
		
		maggieCount=maggie;
		dosaCount=dosa;
		oilPouchesCount=oilPouches;
		panipuriCount=panipuri;
		masalaCount=masala;	
	}

	void itemQuantity(int orderMaggie,int orderDosa,int orderOilPouches,int orderPanipuri,int orderMasala){
		
		requestedMaggie=orderMaggie;
		requestedDosa=orderDosa;
		requestedOilPouches=orderOilPouches;
		requestedPanipuri=orderPanipuri;
		requestedMasala=orderMasala;
		
		System.out.println("MAGGIE:");
		if(orderMaggie<=maggieCount){
			System.out.println("Maggies are available in stock");
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("DOSA:");
		if(orderDosa<=dosaCount){
			System.out.println("Dosas are available in stock");
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("OIL POUCHES:");
		if(orderOilPouches<=oilPouchesCount){
			System.out.println("Oil Pouches are available in stock");
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("PANIPURI:");
		if(orderPanipuri<=panipuriCount){
			System.out.println("Panipuries are available in stock");
		}else{
			System.out.println("running out of stock");
		}
		System.out.println("MASALA:");
		if(orderMasala<=masalaCount){
			System.out.println("Masalas are available in stock");
		}else{
			System.out.println("running out of stock");
		}
	}
	
	void remainingQuantity(){
		
		System.out.println("*********Remaining Stock**********");
		if(requestedMaggie<=maggieCount){
		int remainingMaggie=maggieCount-requestedMaggie;
		System.out.println("After selling remaining maggie is " +remainingMaggie);
		}else{
			System.out.println("Item sold out");
		}
		if(requestedDosa<=dosaCount){
		int remainingDosa=dosaCount-requestedDosa;
		System.out.println("After selling remaining dosa is " +remainingDosa);
		}else{
			System.out.println("Item sold out");
		}
		if(requestedOilPouches<=oilPouchesCount){
		int remainingOilPouches=oilPouchesCount-requestedOilPouches;
		System.out.println("After selling remaining oilPouches is " +remainingOilPouches);
		}else{
			System.out.println("Item sold out");
		}
		if(requestedPanipuri<=panipuriCount){
		int remainingPanipuri=panipuriCount-requestedPanipuri;
		System.out.println("After selling remaining panipuri is " +remainingPanipuri);
		}else{
			System.out.println("Item sold out");
		}
		if(requestedMasala<=masalaCount){
		int remainingMasala=masalaCount-requestedMasala;
		System.out.println("After selling remaining masala is " +remainingMasala);	
		}else{
			System.out.println("Item sold out");
		}
	}
	
	public static void main(String[] args){
		Assignment9 assignment9=new Assignment9();
		assignment9.inStock(50,43,39,43,73);
		assignment9.itemQuantity(45,30,30,30,75);
		assignment9.remainingQuantity();
	}
	
}