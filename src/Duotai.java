abstract class Animal
{
    abstract void eat();
}


class Cat extends Animal
{
	void eat()
	{
		System.out.println("猫吃鱼");
	}
	
	void catchMouse()
	{
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("狗吃骨头");
	}
	
	void yao()
	{
		System.out.println("狗咬人");
	}
}

class DoWork  //工具类 多态思想
{
	public  void mode(Animal a)
	{
		a.eat();	
		if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog c = (Dog)a;
			c.yao();
		}
			
	}
}


public class Duotai {

	public static void main(String[] args) {
	    
		/*Animal a = new Cat();  //向上转型  子类转父类  父类引用指向子类
		a.eat(); 
		// a.catchMouse();  不能使用子类特有的方法
		
		Cat c = (Cat) a;  //向下转型  父类转子类的引用 
		c.catchMouse();   //使用子类特有的方法
		
		  // Animal aa =new Animal();    
		  //Cat cc = (Ct) aa;
		 //这种是 父类对象转为子类对象 是不行的		  
        */		
		
		
		//mode(new Cat());
		//mode(new Dog());
		
		
		DoWork dW =new DoWork();
		dW.mode(new Cat());
		dW.mode(new Dog());
		
	}
	
	public static void mode(Animal a)
	{
		a.eat();	
		if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog c = (Dog)a;
			c.yao();
		}
			
	}

}
