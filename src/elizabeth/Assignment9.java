package elizabeth;

class Assignment9{
	
	int maggieCount=50;
	int dosaCount=43;
	int oilPouchesCount=39;
	int panipuriCount=43;
	int masalaCount=73;
	int remainingMaggie;
	int remainingDosa;
	int remainingOilPouches;
	int remainingPanipuri;
	int remainingMasala;

	void orderDetails(int orderMaggie,int orderDosa,int orderOilPouches,int orderPanipuri,int orderMasala){
		
		System.out.println("**********List of items purschased*************");
		System.out.println("MAGGIE:");
		if(orderMaggie<=maggieCount){
			remainingMaggie=maggieCount-orderMaggie;
			System.out.println("Maggies are available in stock");
			System.out.println("After selling remaining maggie is " +remainingMaggie);
		}else{
			System.out.println("running out of stock");
		}
		
		System.out.println("DOSA:");
		if(orderDosa<=dosaCount){
			remainingDosa=dosaCount-orderDosa;
			System.out.println("Dosas are available in stock");
			System.out.println("After selling remaining dosa is " +remainingDosa);
		}else{
			System.out.println("running out of stock");
		}
		
		System.out.println("OIL POUCHES:");
		if(orderOilPouches<=oilPouchesCount){
			remainingOilPouches=oilPouchesCount-orderOilPouches;
			System.out.println("Oil Pouches are available in stock");
			System.out.println("After selling remaining oilPouches is " +remainingOilPouches);
		}else{
			System.out.println("running out of stock");
		}
		
		System.out.println("PANIPURI:");
		if(orderPanipuri<=panipuriCount){
			remainingPanipuri=panipuriCount-orderPanipuri;
			System.out.println("Panipuries are available in stock");
			System.out.println("After selling remaining panipuri is " +remainingPanipuri);
		}else{
			System.out.println("running out of stock");
		}
		
		System.out.println("MASALA:");
		if(orderMasala<=masalaCount){
			remainingMasala=masalaCount-orderMasala;
			System.out.println("Masalas are available in stock");
			System.out.println("After selling remaining masala is " +remainingMasala);	
		}else{
			System.out.println("running out of stock");
		}
	}
	
	void outOfStock(){
		System.out.println("*********Remaining Stock Count**********");
		if(remainingMaggie!=0){
		System.out.println("Maggie is in stock");
		}else{
			System.out.println("Item sold out");
		}
		
		if(remainingDosa!=0){
			System.out.println("Dosa is in stock");
		}else{
			System.out.println("Item sold out");
		}
		
		if(remainingOilPouches!=0){
			System.out.println("Oil Pouches are in stock");
		}else{
			System.out.println("Item sold out");
		}
		
		if(remainingPanipuri!=0){
			System.out.println("panipuriCount is in stock");
		}else{
			System.out.println("Item sold out");
		}
		
		if(remainingMasala!=0){
			System.out.println("Masala is in stock");
		}else{
			System.out.println("Item sold out");
		}
	}
	
	public static void main(String[] args){
		Assignment9 assignment9=new Assignment9();
		assignment9.orderDetails(40,70,56,30,50);
		assignment9.outOfStock();
	}
	
	
}