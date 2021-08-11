package parthav;

class DataTypeCheck{
	
	void Datacheck(int param){
		System.out.println("Its an int method");
	}
	
	void Datacheck(byte param){
		System.out.println("Its an byte method");
	}
	
	void Datacheck(long param){
		System.out.println("Its an long method");
	}
	
	public static void main(String [] args){
		DataTypeCheck d = new DataTypeCheck();
		d.Datacheck(120);

	}

}