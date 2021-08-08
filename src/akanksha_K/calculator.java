package akanksha_K;

class Calculator{
	
  void add(int x, int y){
       int sum=x+y;
       System.out.println("Addition is: " +sum);
  }

 void sub(int x, int y){
       int subans=x-y;
       System.out.println("substraction is: " +subans);
  }

 void mul(int x, int y){
       int mulans=x*y;
       System.out.println("Multiplication is: " +mulans);
 }

 
void div(int x, int y){
       int divans=x/y;
       System.out.println("Divison is: " +divans);
 }


public  static void main(String[] arg){
	Calculator calculator= new Calculator();
	calculator.add(100,100);
	calculator.sub(100,50);
	calculator.mul(10,5);
	calculator.div(6,3);

}
}