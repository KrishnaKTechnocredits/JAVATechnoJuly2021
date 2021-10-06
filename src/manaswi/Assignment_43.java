package manaswi;

class Assignment_43
{
	void getLength(String str)
	{
		int count=0;
		while(true)
		{
			try
			{
				str.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se)
			{
				break;
			}
		}
		System.out.println(str+":" +count);
	}

	public static void main(String[] args)
	{
		Assignment_43 assignment_43=new Assignment_43();
		assignment_43.getLength("technocredits");
		assignment_43.getLength("manaswi");
	}
}