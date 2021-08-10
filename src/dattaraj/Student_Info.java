package dattaraj;

public class Student_Info{
	
	void studentName(String f_name,String m_name,String l_name,String b_dt){
		System.out.println(f_name);
		System.out.println(m_name);
		System.out.println(l_name);
		System.out.println(b_dt);
    }

    void  studentOtherDetails(String address,int roll_nm){
		System.out.println(address);
		System.out.println(roll_nm);
    }
	
	public static void main(String[] args){
		Student_Info info = new Student_Info();
		
		String f_name="Dattaraj";
		String m_name="Mahadev";
		String l_name="Wete";
		String birth_dt="6th APR 1995";
		String address="Sawantwadi, Sindhudurg.";
		int roll_nm=47515;
	
		info.studentName(f_name,m_name,l_name,birth_dt);
		info.studentOtherDetails(address,roll_nm);
	}	
}