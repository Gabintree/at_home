package JavaStart;

import java.util.Scanner;

public class JavaOperation {

	public static void main(String[] args) {
	
		int num1, num2;
		int op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ���.");
		num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ���.");
		num2 = sc.nextInt();
		System.out.println("������� 1,2,3,4 ���� [+ - * /]");
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
13. ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾� 
�ش� ������ ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�. 
��, switch���� Ȱ���Ͽ� ������ �� �ֵ��� �ϸ� 
���� ����� ������ ���·� ó���Ѵ�.

���� ��)
ù ��° ���� �Է� : 10
�� ���� ���� �Է� : 28
������ �Է�(+ - * /) : +
��� : 10 + 28 = 38

*/

