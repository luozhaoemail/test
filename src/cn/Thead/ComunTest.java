package cn.Thead;
/**
 * 等待唤醒机制  在同步中对同一把锁进行操作。
 * @author luozhao
 *
 */
class Res{
	 String name;
	 String sex;
	 boolean flag= false;   
	
}

class Input implements Runnable{  
	private Res r;
	
	Input(Res rr){
		this.r = rr;
	}
	public void run(){
		int x =0;
		while(true){
			synchronized(r){
				if(r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(x == 0 ){
					r.name="luozhao";
					r.sex ="man";
				}
				else{			
					r.name="丽丽";
					r.sex ="女";
				}
				x = (x+1)%2;
				r.flag = true;
				r.notify();
			}
		}
		
	}
			
}

class Output implements Runnable{
	private Res r;
	
	Output(Res rr){
		this.r = rr;
	}
	public void run(){
		while(true){
	      synchronized(r){
	    	 if(!r.flag)
				try {
					r.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 		 System.out.println(r.name+"......"+r.sex);
	 		 r.flag= false;
	 		 r.notify();
	       }
		}
	}
			
}

public class ComunTest {

	public static void main(String[] args) {
		Res r =new Res();  //资源
		
		Input in = new Input(r);  //输入线程
		Output out = new Output(r);//输出线程
		
		Thread t1 =new Thread(in);
		Thread t2 =new Thread(out);
		t1.start();
		t2.start();
		

	}

}
