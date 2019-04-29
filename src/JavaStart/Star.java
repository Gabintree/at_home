package JavaStart;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		int data;
		
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("1부터 3까지 숫자 중에서 하나를 입력하시오.");
		data = sc.nextInt();
		
		switch(data)
		{
		case 1 : 
			System.out.println("★");
			break;
		case 2 : 
			System.out.println("★★");
			break;
		case 3 : 
			System.out.println("★★★");
			break;
		}
	}

}

/*
12. 1부터 3까지의 정수중 하나를 사용자로부터 입력받아 
입력받은 정수만큼 별문자가 출력되는 프로그램을 만든다. 
단, switch문을 이용한다.
실행 예)
임의의 정수 입력(1~3) : 3
★★★
 */

