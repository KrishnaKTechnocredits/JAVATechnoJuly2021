package sayali_V;

public class Assignment3 
{
	void browserName(String browser)
	{
		if(browser.equals("chrome") || browser.equals("IE") || browser.equals("Edge"))
		{
			System.out.println("valid browser");
		}else if(browser.equals("Safari") || browser.equals("FF"))
		{
		System.out.println("Invalid");
		}
		else
		{
			System.out.println("not vaid or invalid");
		}
	}
	
	public static void main(String args[])
	{
		Assignment3 example13=new Assignment3();
		example13.browserName("chrome");
		example13.browserName("FF");
		example13.browserName("chro");
	}
}
