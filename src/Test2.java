
public class Test2 {

	public static void main(String[] args) {
		
		//int w = Integer.valueOf(args[0]);
		//int h = Integer.valueOf(args[1]);
		//int w = Integer.parseInt(args[0]);
		//int h = Integer.parseInt(args[1]);
		
		
					
		int i,j;
		try{
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		testClass tc =new testClass(i, j);
		tc.draw();
		}
		catch(ArrayIndexOutOfBoundsException err){
		System.out.println("����������������У��磺java TryCatch 20 5");
		}
		catch(NumberFormatException err){
		System.out.println("���뷨�������������������֡�");

		}
		catch(ArithmeticException err){
		System.out.println("�û�����ĵڶ�������������0.");
		}
	}

}


