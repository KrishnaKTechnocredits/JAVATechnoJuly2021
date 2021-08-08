package manaswi;

class DayIndex
{
	void days (int day)
	{
		if(day >= 1 && day <= 5 )
		{
			System.out.println("This is weekday");
		}
		else if (day >= 6 && day <= 7)
		{
			System.out.println("This is weekend.Enjoy..!!");
		}
		else
		{
			System.out.println("Invalide Index");
		}
	}
	public static void main (String [] args)
	{
		DayIndex dayIndex = new DayIndex();
		dayIndex.days(3);
		dayIndex.days (6);
		dayIndex.days(9);
		
	}
}
