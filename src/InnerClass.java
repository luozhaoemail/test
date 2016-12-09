class Outer
{  
   private static int a=5;
   private int x = 3;
	
   class Inner  //内部类在成员位置上
   {   
	   int x = 4;
	   void  method()  //
	   {
		   int x = 5;
		   System.out.println("内部："+x);
		   System.out.println("内部："+this.x);
		   System.out.println("内部："+Outer.this.x); //内部类默认持有外部类的对象引用，所以内部类能直接访问内部类
	   }
   }
   
   static  class Inn2 //静态内部类 
   {
	   void test()
	   {
		   System.out.println(a);
	   }
	   
	   static void test2()
	   {
		   System.out.println(a);
	   }
   }
   
   void fun()  //
   {
	 Inner inner = new Inner();  
	 inner.method();
	 
	 class In3  //内部类在非成员位置上，局部的
	 {
		 void testlocal()
		 {
			 System.out.println("11111");
		 }
	 }
	 new In3().testlocal();
   }
}


public class InnerClass {
   public static void main(String[] args) {
	   Outer out = new Outer();
	   out.fun(); 
	   	   
	   Outer.Inner inn = new Outer().new Inner();   //直接访问内部类
	   inn.method();
	  
	   
	   Outer.Inn2 inn2 = new Outer.Inn2(); //1 静态内部类 非静态方法
	   inn2.test();
	   
	   Outer.Inn2.test2();  //2静态内部类 静态方法
	   
	   
	  	   
 }
}
