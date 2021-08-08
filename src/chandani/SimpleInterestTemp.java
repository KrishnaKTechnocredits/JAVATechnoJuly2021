package chandani;

class SimpleInterestTemp{
  
  void simpleInterest(int p, int n, int r){
	int si = p * n * r/100;
	System.out.println("Simple Interest is "+si);
  }
  
  void tempFahrenheit(int farenheit){
	float celsius = (farenheit - 32) * 5/9f;
	System.out.println("conversion of farenheit to celsius is "+celsius);
  }
  

  public static void main (String[] args){
	SimpleInterestTemp simpleInterestTemp = new SimpleInterestTemp();
	simpleInterestTemp.simpleInterest(200,20,40);
	simpleInterestTemp.tempFahrenheit(100);
  }
}