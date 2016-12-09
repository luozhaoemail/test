
public class StringDemo {

	public static void main(String[] args) {
		
		int n = 12345;
        String s1 = String.valueOf(n);//变成“12345”字符串
        int x = s1.length();
        System.out.println(x);  //判断一个自然数是几位数字
        
		String s = "子串示例";

        int len = s.length(); //获得字符串长度

        for(int begin = 0;begin < len-1;begin++)//起始索引值

                  for(int end = begin + 1;end <= len;end++) //结束索引值

                       System.out.println(s.substring(begin,end));//输出一个字符串的所有子串
                
	}
}
