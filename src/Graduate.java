class Student{
	 int math = 60;
	 static int computer = 60;
	 int english = 60;
	
	 public Student(){
	    study();
	    exercise();
	 }
	 public void study(){
	     System.out.println("Student.study:ÿλѧ����������ѧϰ");
	  }
	 public static void exercise(){
	    System.out.println("Student.exercise:����ѧ����������ϰ");
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
    System.out.println("Graduate.study:ÿλ�о�����������ѧϰ");
 }
 public static void exercise(){
    System.out.println("Graduate.exercise:�����о�����������ϰ");
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


