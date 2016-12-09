
//接口扩展例子
interface PCI   
{
    public void open();
    public void close();
}

class MainBoard
{
	public void run()
	{
		System.out.println("主板启动");
	}
	
	public void usePCI(PCI p)  //接口型引用指向自己的子类对象
	{ 
		if(p!=null)
		{
			p.open(); 
			p.close();
		}
	}
}

class netCard implements PCI
{
	public void open()
	{
		System.out.println("使用网卡");
	}
	
	public void close()
	{ 
		System.out.println("停止网卡");
	}
}

class soundCard implements PCI
{
	public void open()
	{
		System.out.println("使用声卡");
	}
	
	public void close()
	{ 
		System.out.println("停止声卡");
	}
}


public class Compture {

	public static void main(String[] args) {
	    
		MainBoard mb = new  MainBoard();
		mb.run();
		mb.usePCI(new netCard());
		mb.usePCI(new soundCard());
	}

}
