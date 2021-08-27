package bhakti;

public class Assignment_9_checkQnt {
	
	void checkQnt(String product, int qnt){
		if (product.equals("Maggi")){
			if (qnt > AssignmentBk_9_class1.maggieQnt) {
				System.out.println(product + " :Running out of stock");
			    System.out.println( "---------------------");
			}    
			else {
				AssignmentBk_9_class1.maggieQnt= AssignmentBk_9_class1.maggieQnt-qnt;
				System.out.println(product+ " is avaibale and remaining quntity will be "+AssignmentBk_9_class1.maggieQnt);
				System.out.println( "---------------------");
		    }
	    }
		else if (product.equals("Dosa")){
			if (qnt > AssignmentBk_9_class1.dosaQnt) {
				System.out.println(product + " :Running out of stock");
				System.out.println( "---------------------");
			}	
			else { 
				AssignmentBk_9_class1.dosaQnt= AssignmentBk_9_class1.dosaQnt-qnt;
				System.out.println(product+ " is avaibale and remaining quntity will be "+AssignmentBk_9_class1.dosaQnt);
				System.out.println( "---------------------");
			}	
		 }else if (product.equals("Panipuri")){
				if (qnt > AssignmentBk_9_class1.panipuriQnt) {
					System.out.println(product + " :Running out of stock");
					System.out.println( "---------------------");
				}	
				else { 
					AssignmentBk_9_class1.panipuriQnt= AssignmentBk_9_class1.panipuriQnt-qnt;
					System.out.println(product+ " is avaibale and remaining quntity will be "+AssignmentBk_9_class1.panipuriQnt);
					System.out.println( "---------------------");
				}	
				
		 }else if (product.equals("Masala")){
				if (qnt > AssignmentBk_9_class1.masalaQnt) {
					System.out.println(product + " :Running out of stock");
					System.out.println( "---------------------");
				}	
				else { 
					AssignmentBk_9_class1.masalaQnt= AssignmentBk_9_class1.masalaQnt-qnt;
					System.out.println(product+ " is avaibale and remaining quntity will be "+AssignmentBk_9_class1.masalaQnt);
					System.out.println( "---------------------");
				}	
		}else if (product.equals("Pouches")){
			if (qnt > AssignmentBk_9_class1.pouchesQnt) {
				System.out.println(product + " :Running out of stock");
				System.out.println( "---------------------");	
			}	
			else { 
				AssignmentBk_9_class1.pouchesQnt= AssignmentBk_9_class1.pouchesQnt-qnt;
				System.out.println(product+ " is avaibale and remaining quntity will be "+AssignmentBk_9_class1.pouchesQnt);
				System.out.println( "---------------------");
			}
		}
	}

}
