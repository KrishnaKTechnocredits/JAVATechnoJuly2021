package sayali_V;

public class Assignment_3 
{
	void dayCount(int dayIndex)
	{
		if(dayIndex>=1 && dayIndex<=5)
		{
			System.out.println("weekday");
		}
		else if(dayIndex>=6 && dayIndex<=7)
		{
			System.out.println("weekend");
		}
		else	
		{
			System.out.println("Invalid Index");
		}
	}
	public static void main(String args[])
	{
		Assignment_3 dayindex=new Assignment_3();
		dayindex.dayCount(3);
		dayindex.dayCount(6);
		dayindex.dayCount(11);
		dayindex.dayCount(-3);
	}
}
