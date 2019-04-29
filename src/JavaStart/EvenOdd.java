package JavaStart;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
				
		int val;
		String result;
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		val = sc.nextInt();
		
		result = val % 2 == x ? "짝수" : "홀수";
		System.out.println("해당 숫자는 " + result + "입니다." );
	}
}
		


/*
3. 사용자로부터 임의의 정수를 입력받아 
정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다. 
 단, 조건연산자(삼항연산자)를 활용하여 작성할 수 있도록 한다.
실행 예)
정수 입력 : 5
결과 : 홀수
*/

