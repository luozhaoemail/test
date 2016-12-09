class Student{
	 int math = 60;
	 static int computer = 60;
	 int english = 60;
	
	 public Student(){
	    study();
	    exercise();
	 }
	 public void study(){
	     System.out.println("Student.study:每位学生都在认真学习");
	  }
	 public static void exercise(){
	    System.out.println("Student.exercise:所有学生都在做练习");
	 }
}


class Graduate extends Student{
 int math = 99;
 int computer = 99;
 static int english = 99;
 
 public Graduate(){
    study();
    exercise();
 }
 
 public void study(){
    System.out.println("Graduate.study:每位研究生都在认真学习");
 }
 public static void exercise(){
    System.out.println("Graduate.exercise:所有研究生都在做练习");
 }
 
 public static void main(String[] args) {
	 
	  Student s = new Graduate();
	  System.out.println();
	  Graduate g = new Graduate();
	  
	  System.out.print(s.math);
	  System.out.print("\t");
	  System.out.print(s.computer);
	  System.out.print("\t");
	  System.out.println(s.english);
	  
	  System.out.print(g.math);
	  System.out.print("\t");
	  System.out.print(g.computer);
	  System.out.print("\t");
	  System.out.println(g.english);
	  
	  Student s2 = new Graduate();
	  System.out.print(s2.math);
	  System.out.print("\t");
	  System.out.print(s2.computer);
	  System.out.print("\t");
	  System.out.println(s2.english);
 }
}


