package priti;


class Assingment_6{
	int simpleIntrest;
	
	void calSimpleIntrest(int p, int t, int r){
		simpleIntrest = p*t*r;
		System.out.println("Simple interest is - " + simpleIntrest);
	}
	
	void ConverTempFromFarToCelsius (int faren){
		int celsius = (faren-32) *5/9;
		System.out.println("Temprature in celsius is - " + celsius);
	}
	
	public static void main(String[] a){
		Assingment_6 assingment_6 = new Assingment_6();
		assingment_6.calSimpleIntrest(1000,1,10);
		assingment_6.calSimpleIntrest(1000,2,10);
		assingment_6.calSimpleIntrest(1000,3,10);
		assingment_6.ConverTempFromFarToCelsius(100);
		assingment_6.ConverTempFromFarToCelsius(99);
		assingment_6.ConverTempFromFarToCelsius(98);
	}
}

	
