package JavaStart;

import java.util.Scanner;

public class JavaOperation {

	public static void main(String[] args) {
	
		int num1, num2;
		int op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		num2 = sc.nextInt();
		System.out.println("순서대로 1,2,3,4 선택 [+ - * /]");
		op = sc.nextInt();
		
		switch(op)
		{
		case 1 : 
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2 : 
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3 :
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4 : 
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;		
		}

	}

}



/*
13. 사용자로부터 임의의 두 정수와 연산자를 입력받아 
해당 연산의 처리 결과를 출력하는 프로그램을 작성한다. 
단, switch문을 활용하여 구현할 수 있도록 하며 
연산 결과는 정수의 형태로 처리한다.

실행 예)
첫 번째 정수 입력 : 10
두 번재 정수 입력 : 28
연산자 입력(+ - * /) : +
결과 : 10 + 28 = 38

*/

