package technocredits1.code_Interview;

public class Client {

	public static void main(String[] args) {
		/*Student s1 = new Student(1,"Techno");
		s1.display();
		
		Student s2 = s1;
		s2.display();
		
		System.out.println(s1==s2);*/
		
		
		Student s1 = new Student();
		s1.setRno(1);
		s1.setName("Techno");
		s1.display();
		
		Student s2 = s1.getCopy(s1);
		s2.setName("Parthav");
		s2.display();
		
		System.out.println(s1 == s2);
	}
}
