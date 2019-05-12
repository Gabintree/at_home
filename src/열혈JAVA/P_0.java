package 열혈JAVA;

public class P_0 {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num>0 ? "양수" : num<0 ? "음수":"0");
		
		int num1 = 456;
		System.out.println(num1 / 100 * 100) ;
		
		int num2 = 333;
		System.out.println(num2 / 10 * 10 +1);
		
		int num3 = 24;
		System.out.println((num3/10+1)*10-num3);
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		ch =(char)(ch+ 2);
		
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d == f2;
		
		System.out.println("c=" +c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		
		
		char ch1 = 'q';
		boolean b1 = ('a' <= ch1 && ch <= 'z' || 'A' <= ch1 && ch1 <= 'Z' || '0' <= ch && ch <= '9');
		System.out.println(b1);

		
	}

}
