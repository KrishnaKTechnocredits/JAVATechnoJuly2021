package indrani;

	public class Assignment_9 {
		
		static int stockOfMaggie=50,stockOfDosa=43,stockOfPouches=39,stockOfPanipuri=43,stockOfMasala=73;
		
			
			void outOfStockItems(){
				
				System.out.println("Out of Stock Items: ");
				if (stockOfMaggie==0) {
					System.out.println("Maggie is out of stock ");
				}
				if (stockOfDosa==0) {
					System.out.println("Dosa is out of stock ");
				}
				if (stockOfPouches==0) {
					System.out.println("Oil Pouch is out of stock ");
				}
				if (stockOfPanipuri==0) {
					System.out.println("PaniPuri is out of stock ");
				}
				if (stockOfMasala==0) {
					System.out.println("Masala is out of stock ");
				}
				
				System.out.println("--------------------------------");
			}
				
			void inStockItems(){
				System.out.println("In Stock Items: ");
				if (stockOfMaggie>0) {
					System.out.println(stockOfMaggie+" Maggie packets are available ");
				}
				if (stockOfDosa>0) {
					System.out.println(stockOfDosa+" Dosa packets are available ");
				}
				if (stockOfPouches>0) {
					System.out.println(stockOfPouches+" Oil packets are available ");
				}
				if (stockOfPanipuri>0) {
					System.out.println(stockOfPanipuri+" PaniPuri packets are available ");
				}
				if (stockOfMasala>0) {
					System.out.println(stockOfMasala+" Masala packets are available ");
				}
				
				System.out.println("--------------------------------");
			
			}
			
			void purchaseOrder(int Maggie ,int Dosa,int Oil,
					int Panipuri,int Masala) {
				
				System.out.println("Purchase Summary : ");
				
				if(stockOfMaggie<Maggie) {
					System.out.println("Maggie packets running out of stock ");
				}
				else {
					stockOfMaggie-=Maggie;
					System.out.println(Maggie+" Maggie packets Purchased ");
				}
				
				if(stockOfDosa<Dosa) {
					System.out.println("Dosa packets running out of stock ");
				}
				else {
					stockOfDosa-=Dosa;
					System.out.println(Dosa+" Dosa Purchased ");
				}
				
				if(stockOfPouches<Oil) {
					System.out.println("Oil packets running out of stock ");
				}
				else {
					stockOfPouches-=Oil;
					System.out.println(Oil+" Oil pouches Purchased ");
				}
				
				if(stockOfPanipuri<Panipuri) {
					System.out.println("Panipuri packets running out of stock ");
				}
				else {
					stockOfPanipuri-=Panipuri;
					System.out.println(Panipuri+" Panipuri packets Purchased ");
				}
				
				if(stockOfMasala<Masala) {
					System.out.println("Masala packets running out of stock ");
				}
				else {
					stockOfMasala-=Masala;
					System.out.println(Masala+" Masala packets Purchased ");
				}
				
				System.out.println("--------------------------------");
				
			}
			
			public static void main(String[] args){
				Assignment_9 buyer1 = new Assignment_9();
				
				buyer1.inStockItems();
				buyer1.outOfStockItems();
				buyer1.purchaseOrder(35,43,1,43,10);
				
				
				System.out.println("---------------------------------");
				
				Assignment_9 buyer2 = new Assignment_9();
				buyer2.inStockItems();
				buyer2.outOfStockItems();
				buyer2.purchaseOrder(1,4,2,7,3);
			}
				
				
}
