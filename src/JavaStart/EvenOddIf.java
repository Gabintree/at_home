package JavaStart;

import java.util.Scanner;

public class EvenOddIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ifoper op = new Ifoper();
		
		System.out.println("������ �Է��ϼ���.");
		int num = sc.nextInt();
		op.oper(num);
		}
}
class Ifoper{
				
		public void oper(int num) {
			
			if(num % 2 == 0) {
				System.out.println("¦��");
			}else{System.out.println("Ȧ��");
			}
		}
}


/*
6. ����ڷκ��� ������ ������ �Է¹޾� 
�Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�. 
��, if���� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է� : 37
��� : Ȧ���Դϴ�.
*/
