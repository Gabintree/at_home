package JavaStart;

import java.io.IOException;

public class Letter {

	public static void main(String[] args) throws IOException {
		
		int n;
		System.out.println("���ĺ� �� ���ڸ� �Է��� �ּ���.");
		n = System.in.read();

		if(n >= 65 && n <= 90) { 
			System.out.println((char)(n+=32));
		}else if (n >= 97 && n <=122) {
			System.out.println((char)(n-=32));
		}
	}
}


/*
11.����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾Ƽ� �̸� �Ǻ��Ͽ� 
�ҹ��ڸ� �Է¹޾��� ��� �빮�ڷ� ��ȯ�ϰ�, 
�빮�ڸ� �Է¹޾��� ��� �ҹ��ڷ� ��ȯ�ϴ� ���α׷��� �ۼ��Ѵ�.
���� ��)
���ĺ� �� ���� �Է� : A
>> a
���ĺ� �� ���� �Է� : c
>> C
*/

