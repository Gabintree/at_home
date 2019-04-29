package JavaStart;

import java.util.Scanner;

public class EvenOddIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ifoper op = new Ifoper();
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		op.oper(num);
		}
}
class Ifoper{
				
		public void oper(int num) {
			
			if(num % 2 == 0) {
				System.out.println("짝수");
			}else{System.out.println("홀수");
			}
		}
}


/*
6. 사용자로부터 임의의 정수를 입력받아 
입력받은 정수가 짝수인지 홀수인지 판별하여 결과를 출력하는 프로그램을 구현한다. 
단, if문을 활용하여 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력 : 37
결과 : 홀수입니다.
*/
