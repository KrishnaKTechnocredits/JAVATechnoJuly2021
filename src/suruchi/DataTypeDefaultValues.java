package suruchi;

// Default values and different datatypes

class DataTypeDefaultValues{
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean flag;
	char ch;
	String str;
	
	void printDefaultValues(){
		System.out.println("byte default value is: " + b);
		System.out.println("short default value is: " + s);
		System.out.println("int default value is: " + i);
		System.out.println("long default value is: " + l);
		System.out.println("float default value is: " + f);
		System.out.println("double default value is: " + d);
		System.out.println("boolean default value is: " + flag);
		System.out.println("char default value is: " + ch);
		System.out.println("String default value is: " + str);
	}
	
	public static void main(String[] args){
		DataTypeDefaultValues defaultvalue = new DataTypeDefaultValues();
		defaultvalue.printDefaultValues();
	}

}