
abstract class GetTime//计算程序运行时间  虚拟类模板例子
 {
	 public void getTime()
	 {
		 long s = System.currentTimeMillis();
		 runcode();
		 long e = System.currentTimeMillis();
		 System.out.println("程序运行时间（毫秒）："+(e-s));		 
	 }
	 
	 abstract void runcode();
 }


class SubTime extends GetTime
{
	void runcode()
	{
		for(int i=0; i<1000;i++)
			System.out.println(i);
	}
}




public class TimeDemo {

	public static void main(String[] args) {
	
		new SubTime().getTime();
	}

}
