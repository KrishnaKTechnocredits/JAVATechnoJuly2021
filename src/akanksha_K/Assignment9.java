package akanksha_K;

public class Assignment9 {
	
	 int maggieQuantity = 50;
	 int dosaQuantity= 43;
	 int oilpouchesQuantity  = 39;
	 int panipuriQuantity  = 43;
	 int masalaQuantity  = 73;
	 
	 void buyMaggie(int requestedquantity) {
		 if (requestedquantity <= maggieQuantity) {
			 maggieQuantity = maggieQuantity - requestedquantity;
		     System.out.println("Remaining maggie quantity is: " + maggieQuantity);
		 }
		 else {
			 System.out.println("Cannot serve requested quantity. Available maggie is: " + maggieQuantity);
		 } 
	  }
	 
	 void buyDosa(int requestedquantity) {
		 if (requestedquantity <= dosaQuantity) {
			 dosaQuantity = dosaQuantity - requestedquantity;
		     System.out.println("Remaining Dosa quantity is: " + dosaQuantity);
		 }
		 else {
			 System.out.println("Cannot serve requested quantity. Available Dosa is: " + dosaQuantity);
		 } 
	  }
	 
	 void buyOilpouches(int requestedquantity) {
		 if (requestedquantity <= oilpouchesQuantity) {
			 oilpouchesQuantity = oilpouchesQuantity - requestedquantity;
		     System.out.println("Remaining oil pouch quantity is: " + oilpouchesQuantity);
		 }
		 else {
			 System.out.println("Cannot serve requested quantity. Available oil pouch is: " + oilpouchesQuantity);
		 } 
	  }
	 
	 void buyPanipuri(int requestedquantity) {
		 if (requestedquantity <= panipuriQuantity) {
			 panipuriQuantity = panipuriQuantity - requestedquantity;
		     System.out.println("Remaining panipuri quantity is: " + panipuriQuantity);
		 }
		 else {
			 System.out.println("Cannot serve requested quantity. Available panipuri is: " + panipuriQuantity);
		 } 
	  }
	 
	 void buyMasala(int requestedquantity) {
		 if (requestedquantity <= masalaQuantity) {
			 masalaQuantity = masalaQuantity - requestedquantity;
		     System.out.println("Remaining masala quantity is: " + masalaQuantity);
		 }
		 else {
			 System.out.println("Cannot serve requested quantity. Available masala is: " + masalaQuantity);
		 } 
	  }
	 
	 
	 void outOfStock() {
		 if(maggieQuantity==0)
			 System.out.println("Maggie is out of stock");
		 if(dosaQuantity==0)
			 System.out.println("Dosa is out of stock");
		 if(oilpouchesQuantity==0)
			 System.out.println("Oilpouches is out of stock");
		 if(panipuriQuantity==0)
			 System.out.println("Panipuri is out of stock");
		 if(masalaQuantity==0)
			 System.out.println("Masala is out of stock"); 
	  }
	 
	 void AvailableInStock() {
		 if(maggieQuantity>0) {
			 System.out.println("Maggie is available in stock, Quanyity: " + maggieQuantity);
		 }
		 if(dosaQuantity>0) {
			 System.out.println("Dosa is available in stock, Quanyity: " + dosaQuantity);
		 }
		 if(oilpouchesQuantity>0) {
			 System.out.println("Oil pouch is available in stock, Quanyity: " + oilpouchesQuantity);
		 }
		 if(panipuriQuantity>0) {
			 System.out.println("Panipuri is available in stock, Quanyity: " + panipuriQuantity);
		 }
		 if(masalaQuantity>0) {
			 System.out.println("Masala is available in stock, Quanyity: " + masalaQuantity);
		 }
		 
	  }
	  
	 public static void main(String[] args) {
		 Assignment9 assignment9 = new Assignment9();
		 assignment9.buyMaggie(30);
		 assignment9.buyDosa(15);
		 assignment9.buyOilpouches(12);
		 assignment9.buyPanipuri(43);
		 assignment9.buyMasala(75);
		 System.out.println("");
		 assignment9.outOfStock();
		 System.out.println("");
		 assignment9.AvailableInStock();
		 
	   }
}
