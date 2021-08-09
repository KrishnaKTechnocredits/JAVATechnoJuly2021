package priti;

class Assingment_2 {
	int X = 10;
	int Y = 20;
	
	void processData (){
		X= 50;
		Y = 100;
	}
	
	void displayInfo(){
		int z = X+Y;
		System.out.println(z);
	}
	
	public static void main(String[] a){
		Assingment_2 assingment_2 = new Assingment_2();
		assingment_2.processData();
		assingment_2.displayInfo();
		
		Assingment_2 assingment_2_1 = new Assingment_2();
		assingment_2_1.displayInfo();
	
	}

}
