//Purches item, shown item quanity, out of stock 
package bhakti;

class AssignmentBk_9{
	int maggieQnt= 50;
	int dosaQnt = 43;
	int pouchesQnt= 39;
	int panipuriQnt= 43;
	int masalaQnt= 73;
	 
	
	void checkQnt(String product, int qnt){
		if (product.equals("Maggi")){
			if (qnt > maggieQnt) {
				System.out.println(product + " :Running out of stock");
			    System.out.println( "---------------------");
			}    
			else {
				maggieQnt= maggieQnt-qnt;
				System.out.println(product+ " is avaibale and remaining quntity will be "+maggieQnt);
				System.out.println( "---------------------");
		    }
	    }
		else if (product.equals("Dosa")){
			if (qnt > dosaQnt) {
				System.out.println(product + " :Running out of stock");
				System.out.println( "---------------------");
			}	
			else { 
				dosaQnt= dosaQnt-qnt;
				System.out.println(product+ " is avaibale and remaining quntity will be "+dosaQnt);
				System.out.println( "---------------------");
			}	
		 }else if (product.equals("Panipuri")){
				if (qnt > panipuriQnt) {
					System.out.println(product + " :Running out of stock");
					System.out.println( "---------------------");
				}	
				else { 
					panipuriQnt= panipuriQnt-qnt;
					System.out.println(product+ " is avaibale and remaining quntity will be "+panipuriQnt);
					System.out.println( "---------------------");
				}	
				
		 }else if (product.equals("Masala")){
				if (qnt > masalaQnt) {
					System.out.println(product + " :Running out of stock");
					System.out.println( "---------------------");
				}	
				else { 
					masalaQnt= masalaQnt-qnt;
					System.out.println(product+ " is avaibale and remaining quntity will be "+masalaQnt);
					System.out.println( "---------------------");
				}	
		}else if (product.equals("Pouches")){
			if (qnt > pouchesQnt) {
				System.out.println(product + " :Running out of stock");
				System.out.println( "---------------------");	
			}	
			else { 
				pouchesQnt= pouchesQnt-qnt;
				System.out.println(product+ " is avaibale and remaining quntity will be "+pouchesQnt);
				System.out.println( "---------------------");
			}
		}
	}
	
	void outOfStock() {
		System.out.println("Below items out of stock:");
		if (maggieQnt==0)
			System.out.println("Maggi");
		if (dosaQnt==0)
			System.out.println("Dosa");
		if (pouchesQnt==0)
			System.out.println("Pouches");
		if (panipuriQnt==0)
			System.out.println("Panipuri");
		if (masalaQnt==0)
			System.out.println("Panipuri");
				
		System.out.println( "---------------------");
		
	}
	
	void inOfStock(){
		System.out.println("Below items are in stock:");
		if (maggieQnt>0)
			System.out.println("Maggi: "+maggieQnt );
		if (dosaQnt>0)
			System.out.println("Dosa: " +dosaQnt);
		if (pouchesQnt>0)
			System.out.println("Puches: " +dosaQnt);
		if (panipuriQnt>0)
			System.out.println("Panipuri: " +panipuriQnt);
		if (masalaQnt>0)
			System.out.println("Masala: " +masalaQnt);
		
		System.out.println( "---------------------");
	}
	
		
	public static void main (String[] df){
		AssignmentBk_9 assignmentBk_9 = new AssignmentBk_9();
		 	
		assignmentBk_9.checkQnt("Maggi", 77);
		assignmentBk_9.checkQnt("Dosa", 10);
		assignmentBk_9.checkQnt("Pouches", 39);
		assignmentBk_9.outOfStock();
		assignmentBk_9.inOfStock();
		assignmentBk_9.checkQnt("Roti", 9);
			
	}		
}	