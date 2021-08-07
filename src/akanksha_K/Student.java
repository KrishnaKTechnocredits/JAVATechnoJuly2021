package akanksha_K;

class Student {

      String stdname="techno";
      int rno=1;
 
      void displayInfo(){
           System.out.println("student name is "+stdname);
           System.out.println("student rno is "+rno);
      }

      public static void main(String[] a){
           Student s1 = new Student();
           System.out.println(s1);
           s1.displayInfo(); 
      }
}