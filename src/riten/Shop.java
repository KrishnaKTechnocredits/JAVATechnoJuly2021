package riten;

class Shop{
	
	static int Maggie =50;
	static int Dosa =43; 
	static int pouches =39;
	static int panipuri = 43;  
	static int masala =73;
	static int khakra;
	static int rice;
	
	void outOfStock(){

		if(Maggie ==0 ){
			System.out.println("Maggie is running out of stock");
		}
		
		if (khakra==0){
			System.out.println("khakra is running out of stock");
			
		}
		
		if (rice==0){
			System.out.println("rice is running out of stock");
		}
		
		if (Dosa ==0){
			System.out.println("Dosa is running out of stock");
		}
		
		if (pouches ==0){
			System.out.println("pouches is running out of stock");
		}
		
		if (panipuri ==0){
			System.out.println("panipuri is running out of stock");
		}
		
		if (masala ==0){
			System.out.println("masala is running out of stock");
		}
	}
	
	void availableInStock(){
		if(Maggie >0 ){
			System.out.println("Maggie is available in stock");
		}
		
		if (khakra>0){
			System.out.println("khakra is available in stock");
			
		}
		
		if (rice>0){
			System.out.println("rice is available in stock");
		}
		
		if (Dosa >0){
			System.out.println("Dosa is available in stock");
		}
		
		if (pouches >0){
			System.out.println("pouches available in stock");
		}
		
		if (panipuri >0){
			System.out.println("panipuri is available in stock");
		}
		
		if (masala >0){
			System.out.println("masala is available in stock");
		}
	}
	
	void display(int MaggieL,int DosaL,int pouchesL,int panipuriL,int masalaL,int khakraL,int riceL){
		Maggie=Maggie-MaggieL;
		Dosa=Dosa-DosaL;
		pouches=pouches-pouchesL;
		panipuri=panipuri-panipuriL;
		masala=masala-masalaL;
		khakra=khakra-khakraL;
		rice=rice-riceL;
		System.out.println("Remaining quantity of Maggie is :"+Maggie+"\nRemaining quantity of Dosa is :"+Dosa+"\nRemaining quantity of pouches is :"+pouches+
		"\nRemaining quantity of panipuri is :"+panipuri+"\nRemaining quantity of masala is :"+masala+"\nRemaining quantity of rice is :"+rice);
	}
	
	
	public static void main(String[] args){
		Shop shop=new Shop();
		shop.outOfStock();
		shop.availableInStock();
		shop.display(10,10,20,15,5,10,0);
		
		
	}
}