package JavaStart;

import java.io.IOException;

public class Letter {

	public static void main(String[] args) throws IOException {
		
		int n;
		System.out.println("알파벳 한 문자를 입력해 주세요.");
		n = System.in.read();

		if(n >= 65 && n <= 90) { 
			System.out.println((char)(n+=32));
		}else if (n >= 97 && n <=122) {
			System.out.println((char)(n-=32));
		}
	}
}


/*
11.사용자로부터 알파벳 한 문자를 입력받아서 이를 판별하여 
소문자를 입력받았을 경우 대문자로 변환하고, 
대문자를 입력받았을 경우 소문자로 변환하는 프로그램을 작성한다.
실행 예)
알파벳 한 문자 입력 : A
>> a
알파벳 한 문자 입력 : c
>> C
*/

