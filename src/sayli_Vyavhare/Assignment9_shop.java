package sayli_Vyavhare;

public class Assignment9_shop {
	static int maggiCount, dosaCount,oilPouchesCount,paniPuriCount,masalaCount;
	
	void setStock(int magStock,int dStock,int oilStock,int pStock,int mStock) {
	    maggiCount=magStock;
		dosaCount=dStock;
		oilPouchesCount=oilStock;
		paniPuriCount= pStock;
		masalaCount=mStock;
		}
	
	void maggi(int buyMaggi) {
		maggiCount=maggiCount-buyMaggi;
		}
	
	void dosa(int buyDosa) { 
		dosaCount=dosaCount-buyDosa;
		}
	
	void oilPouches(int buyOil) {
		oilPouchesCount=oilPouchesCount-buyOil;
		}
	void paniPuri (int buyPaniPuri){
		paniPuriCount=paniPuriCount-buyPaniPuri;
		}
	
	void masala(int buyMasala) {
		masalaCount=masalaCount-buyMasala;
		}

	void outOfStock() {
		System.out.println("--------------------------------");
		System.out.println("Out of stock are:");
		if(maggiCount<=0) 
			System.out.println("Maggi is running out of stock");
		if(dosaCount<=0) 
			System.out.println("Dosa is running out of stock");
		if(oilPouchesCount<=0) 
			System.out.println("Oil Pouches are running out of stock");
		if(paniPuriCount<=0) 
			System.out.println("Panipuri is running out of stock");
		if(masalaCount<=0) 
			System.out.println("Masala is running out of stock");
		}
	
	void availableStock() {
		System.out.println("Available stock:");
		if(maggiCount>0) 
			System.out.println("Maggi stock is:"+maggiCount);
	    if(dosaCount>0) 
	    	System.out.println("Dosa stock is:"+dosaCount);
	    if(oilPouchesCount>0) 
	    	System.out.println("Oil pouches stock is:"+oilPouchesCount);
		if(paniPuriCount>0) 
			System.out.println("Pani puri stock is:"+paniPuriCount);
		if(masalaCount>0) 
			System.out.println("Masala stock is:"+masalaCount);
	}

	public static void main(String[] args) {
		Assignment9_shop assignment9_shop=new Assignment9_shop();
		assignment9_shop.setStock(50,43,39,43,73);
		assignment9_shop.maggi(50);
		assignment9_shop.dosa(4);
		assignment9_shop.masala(73);
		assignment9_shop.paniPuri(2);
		assignment9_shop.oilPouches(30);
		assignment9_shop.availableStock();
		assignment9_shop.outOfStock();		
	}
}
