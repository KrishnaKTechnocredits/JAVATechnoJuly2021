//Assignement9
package paresh;

class Shop{
	 static int maggieStock,dosaStock,oilPouchesStock,panipuriStock,masalaStock;

		void setInitailValues(int maggie,int dosa,int oilPouches,int panipuri,int masala){
			maggieStock=maggie;
			dosaStock=dosa;
			oilPouchesStock=oilPouches;
			panipuriStock=panipuri;
			masalaStock=masala;
		}

		void purchase(int maggie,int dosa,int oilPouches,int panipuri,int masala){
			System.out.println("\nPurchase Items Data :");
			if(maggieStock>=maggie){
				maggieStock=maggieStock-maggie;
				System.out.println(maggie +" Maggie Packets Purchase");
			}
			else{
				System.out.println("Maggie running out of stock");
			}

			if(dosaStock>=dosa){
				dosaStock=dosaStock-dosa;
				System.out.println(dosa +" Dosa Packets Purchase");
			}
			else{
				System.out.println("Dosa running out of stock");
			}

			if(oilPouchesStock>=oilPouches){
				oilPouchesStock=oilPouchesStock-oilPouches;
				System.out.println(oilPouches +" Oil Pouches Purchase");
			}
			else{
				System.out.println("Oil Pouches running out of stock");
			}
			if(panipuriStock>=panipuri){
				panipuriStock=panipuriStock-panipuri;
				System.out.println(panipuri +" Panipuri Packets Purchase");
			}
			else{
				System.out.println("Panipuri running out of stock");
			}
			if(masalaStock>=masala){
				masalaStock=masalaStock-masala;
				System.out.println(masala +" Masala Packets Purchase");
			}
			else{
				System.out.println("Masala running out of stock");
			}
		}

		 void itemsOutOfStock(){
			System.out.println("\nItems out of stock:");
			if(maggieStock==0)
				System.out.println("Maggie Packets");
			if(dosaStock==0)
				System.out.println("Dosa Packets");
			if(oilPouchesStock==0)
				System.out.println("Oil Pouches");
			if(panipuriStock==0)
				System.out.println("Panipuri Packets");
			if(masalaStock==0)
				System.out.println("Masala Packets");
		}

		void itemsInStock(){
			System.out.println("\nItems available in stock:");
			if(maggieStock>0)
				System.out.println("Maggie Packets are available " +maggieStock);
			if(dosaStock>0)
				System.out.println("Dosa Packets are available "+dosaStock);
			if(oilPouchesStock>0)
				System.out.println("Oil Pouches are available "+oilPouchesStock);
			if(panipuriStock>0)
				System.out.println("Panipuri Packets are available "+panipuriStock);
			if(masalaStock>0)
				System.out.println("Masala Packets are available "+masalaStock);
		}

		public static void main(String[] args){
			Shop shop=new Shop();
			shop.setInitailValues(50,30,40,20,60);
			shop.purchase(55,30,4,18,60);
			shop.itemsOutOfStock();
			shop.itemsInStock();
			shop.purchase(5,5,9,10,69);

		}
	}
