package jagrati;

public class Assignment_9 {
	 int maggie ;
	 int dosa ;
	 int oil ;
	 int panipuri;
	 int masala;
	 String custName;
	 int qty1, qty2, qty3,qty4,qty5;
	 
	 
	 void initialQuantity(int maggie2, int dosa2, int oil2, int panipuri2, int masala2 ) {
		 maggie= maggie2; //50
		 dosa = dosa2;
		 oil = oil2;
		 panipuri = panipuri2;
		 masala = masala2;
		 
	}void purchesMaggi(int qty){
		
			if(qty > maggie) { //10>50
		}else { 
			qty = maggie - qty; // 50-10=40
			qty1 = qty;
		}
	} void dosaItem(int qty12){
			
		    if(qty12 > dosa) {
		}else { 
			qty12 = dosa - qty12;
			qty2 = qty12;
		   }
		
	} void oilItem(int qty13) {
		
		  if(qty13 > oil) {
		}else { 
			qty13 = oil - qty13;
			qty3 = qty13;
		}
	
	}void panipuriItem(int qty14) {
			
			  if(qty14 > panipuri) {
				  
			}else { 
				qty14 = panipuri - qty14;
				qty4 = qty14;
	
			   }
	}void masalaItem(int qty15) {
		
		  if(qty15 > masala) {
			  
		}else { 
			qty15 = masala - qty15;
			qty5 = qty15;
		   }
	
	}
	void availableInStock(){
		     System.out.println("----Available in stock & respective quantities----");
			 System.out.println("Maggi is Available in stock -> " + qty1);
			 System.out.println("dosa is Available in stock -> " + qty2);
			 System.out.println("Oil is Available in stock -> " + qty3);
			
		
	}void outOfStock(){
		System.out.println("----OutOfStock--------");
		 System.out.println("Panipuri is not Available in stock -> " + qty4);
		 System.out.println("Masala is not Available in stock -> " + qty5);
		
	}
	
	
	public static void main(String []aa) {
			Assignment_9 assignment_9 = new Assignment_9();
			
			assignment_9.initialQuantity(50, 43, 39, 43, 79);
			assignment_9.purchesMaggi(10);
			assignment_9.dosaItem(10);
			assignment_9.oilItem(30);
			assignment_9.panipuriItem(70);
			assignment_9.masalaItem(80);
			assignment_9.availableInStock();
			assignment_9.outOfStock();
			
		} 
		
	    
}
