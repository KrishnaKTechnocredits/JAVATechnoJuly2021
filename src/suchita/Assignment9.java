package suchita;

class Assignment9{

	static int maggie = 50;
	static int dosa = 43;
	static int oil = 39;
	static int panipuri = 43;
	static int masala = 73;
	String name;
	
	
	
	void stockMaggie(String prod,int count){
		name=prod;
		maggie = maggie - count;
		if(maggie>=0 )
			System.out.println(name +" Available in stock  " + maggie);
		else
			System.out.println(name +" Out of Stock ");
		
	}
	
	void stockDosa(String prod,int count){
		name=prod;
		dosa = dosa - count;
		if(dosa>=0 )
			System.out.println(name +" Available in stock  " + dosa);
		else
			System.out.println(name +" Out of Stock ");
		
	}
	
	void stockPanipuri(String prod ,int count){
		name=prod;
		panipuri= panipuri - count;
		if(panipuri>=0 )
			System.out.println(name +" Available in stock  " + panipuri);
		else
			System.out.println(name +" Out of Stock ");
		
	}
	
	void stockOil(String prod , int count){
		name=prod;
		oil = oil -count;
		if(oil>=0 )
			System.out.println(name+ " Available in stock  " + oil);
		else
			System.out.println(name +" Out of Stock ");
		
	}
	
	void stockMasala(String prod,int count){
		name=prod;
		masala = masala-count;
		if(masala>=0 )
			System.out.println(name +" Available in stock  " + masala);
		else
			System.out.println(name +" Out of Stock ");
		
	}
	
	public static void main(String[] args) {
		
		Assignment9 assignment9 = new Assignment9();
		assignment9.stockDosa("Dosa ", 30);
		assignment9.stockMasala("Masala",80);
		assignment9.stockOil("Oil" , 22);
		assignment9.stockMaggie("Maggie",50);
		assignment9.stockPanipuri("Panipuri" , 30);
	}
}