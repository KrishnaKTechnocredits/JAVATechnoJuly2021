package precilla;

public class Assignment6 {
	void simpleInterest(float principleAmount,int time,float rate)
	{
		float simpleInt=principleAmount*time*rate/100;
		System.out.println("Simple Interest is "+simpleInt);
	}
	void fahrenToCelsious(float fahrenheit)
	{
		float celcious=(fahrenheit-32)*5/9;
		System.out.println("After converting temperature from Fahrenheit to celcious degree " +celcious);
	}
	public static void main(String[] args)
	{
		Assignment6 assignment6=new Assignment6();
		assignment6.simpleInterest(2000, 2, 10);
		assignment6.fahrenToCelsious(42);
	}

}
