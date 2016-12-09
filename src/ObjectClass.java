class Demo
{
	private int num;
	Demo(int num)
	{
		this.num = num;		
	}
	
	public boolean equals(Object obj)//比较对象相等
	{
		if( !(obj instanceof Demo) )
			return false;
		Demo d = (Demo) obj;
		
		return this.num ==d.num;
		
	}
}

class Person{}


public class ObjectClass {

	public static void main(String[] args) {
		   Demo d =new Demo(4);
		   Demo d2 =new Demo(4);
		   Person p =new Person();
		   System.out.println(d.equals(p));   
		   
		   System.out.println(d.equals(d2));
		   
  
	}

}
