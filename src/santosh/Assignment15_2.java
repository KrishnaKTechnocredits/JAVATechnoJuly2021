package santosh;
public class Assignment15_2 {

	char[] findMiddleChar(String[] a)
	{
		char[] middle=new char[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()%2==0)
				middle[i]=a[i].charAt(a[i].length()/2 -1);
			else
			    middle[i]=a[i].charAt(a[i].length()/2);	

		}
		return middle;
	}

	public static void main(String[] args) {
		Assignment15_2 assignment15_2=new Assignment15_2();
		String[] a= {"hello","techno","credits"};
		System.out.println("######################################");
		System.out.println("Middle Character of Each String is : >");
		System.out.println(assignment15_2.findMiddleChar(a));
		System.out.println("######################################");
	}	
}
