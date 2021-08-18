package nishi;

public class Assignment15B {

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
		Assignment15B assignment15b=new Assignment15B();
		String[] a= {"hello","techno","credits"};
		System.out.println("middle character of each String : ");
		System.out.println(assignment15b.findMiddleChar(a));
	}	
}
