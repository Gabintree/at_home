package JavaStart;

import java.util.Scanner;

public class ThreeOper {

	public static void main(String[] args) {
	
		int val;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 정수를 입력하세요.");
		val = sc.nextInt();
		
		result = val > 0 ? "양수" : "음수";
	
		if(val == 0) {
		result = "0";
		System.out.println(result);
		}else {System.out.println(result);
		}
	}
}



/*
4. 사용자로부터 임의의 정수를 입력받아 
 정수가 양수인지, 음수인지, 0인지 구분하여 결과를 출력하는 프로그램을 구하시오. 
 단, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.
 
실행 예)
임의의 정수 입력 : -12
결과 : 음수
*/
