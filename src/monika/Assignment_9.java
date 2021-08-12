package monika;

public class Assignment_9 {

	static int maggieCount,dosaCount,oilCount ,panipuriCount,masalaCount;
	
	void setStock(int mgStock,int dStock,int oStock,int pStock,int mStock) {
		maggieCount=mgStock;
		dosaCount=dStock;
		oilCount=oStock;
		panipuriCount=pStock;
		masalaCount=mStock;
	}
	void maggiPacket(int buyMaggi) 
	{
		maggieCount=maggieCount-buyMaggi;
		
	}
	void dosaPacket(int buyDosa)
	{
		dosaCount=dosaCount-buyDosa;
	}
	void oilPacket(int buyOil)
	{
		oilCount=oilCount-buyOil;
			
	}
	void panipuriPacket(int buypanipuri)
	{
		panipuriCount=panipuriCount-buypanipuri;
	}
	void masalaPacket(int buymasala)
	{
		masalaCount=masalaCount-buymasala;
	}
	void outOfStock()
	{
		System.out.println("----------Out Of Stock Items are-----------");
		if(maggieCount<=0)
			System.out.println("Maggie is running Out of Stock");
		if(dosaCount<=0)
			System.out.println("Dosa is running Out of Stock");
		if(oilCount<=0)
			System.out.println("OilPacket is running Out of Stock");
		if(panipuriCount<=0)
			System.out.println("Panipuri Packet is running Out of Stock");
		if(masalaCount<=0)
			System.out.println("Masala Packet is running Out of Stock");
	}
	
	void availableStock()
	{
		System.out.println("=---------Available Stock-------------");
		if(maggieCount>0)
			System.out.println("Maggie -"+maggieCount +" Packets");
		if(dosaCount>0)
			System.out.println("Dosa -"+dosaCount +" Packets");
		if(oilCount>0)
			System.out.println("Oil -"+oilCount +" Packets");
		if(panipuriCount>0)
			System.out.println("PaniPuri-"+panipuriCount +" Packets");
		if(masalaCount>0)
			System.out.println("Masala-"+masalaCount +" Packet");
	}
	
	
	public static void main(String[] args) {
		
		Assignment_9 assignment_9=new Assignment_9();
		assignment_9.setStock(50,43,39,43,73);
		assignment_9.maggiPacket(10);
		assignment_9.dosaPacket(5);
		assignment_9.oilPacket(39);
		assignment_9.panipuriPacket(43);
		assignment_9.masalaPacket(70);
		assignment_9.availableStock();
		assignment_9.outOfStock();
		
		
		
	}
	
	
	
}
