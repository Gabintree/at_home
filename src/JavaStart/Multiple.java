package JavaStart;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Opr op = new Opr();
		
		System.out.println("������ �Է��ϼ���.");
		int val = sc.nextInt();
		op.oper(val);
	}
}
class Opr{
	 	
	public void oper(int val) {
				
		if(val % 2 == 0 && val % 3 == 0) {
			System.out.println("2�� 3�� ���");
		}else if(val % 2 == 0) { 
			System.out.println("2�� ���");
		}else if(val % 3 == 0) {
			System.out.println("3�� ���");
		}else {System.out.println("2�� 3�� ����� �ƴմϴ�.");
		}	
	}
}
	
	



/*
8. ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ 
2�� �������, 3�� �������, 2�� 3�� �������, 2�� 3�� ����� �ƴ��� �Ǻ��Ͽ�
 ����� ����ϴ� ���α׷��� �����Ѵ�.
 
���� ��)
������ ���� �Է� : 8
��� : 2�� ���
������ ���� �Է� : 9
��� : 3�� ���
������ ���� �Է� : 6
��� : 2�� 3�� ���
������ ���� �Է� : 7
��� : 2�� 3�� ��� �ƴ�
*/
