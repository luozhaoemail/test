
abstract class GetTime//�����������ʱ��  ������ģ������
 {
	 public void getTime()
	 {
		 long s = System.currentTimeMillis();
		 runcode();
		 long e = System.currentTimeMillis();
		 System.out.println("��������ʱ�䣨���룩��"+(e-s));		 
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
