
public class StringDemo {

	public static void main(String[] args) {
		
		int n = 12345;
        String s1 = String.valueOf(n);//��ɡ�12345���ַ���
        int x = s1.length();
        System.out.println(x);  //�ж�һ����Ȼ���Ǽ�λ����
        
		String s = "�Ӵ�ʾ��";

        int len = s.length(); //����ַ�������

        for(int begin = 0;begin < len-1;begin++)//��ʼ����ֵ

                  for(int end = begin + 1;end <= len;end++) //��������ֵ

                       System.out.println(s.substring(begin,end));//���һ���ַ����������Ӵ�
                
	}
}
