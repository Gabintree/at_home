package JavaStart;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
				
		int val;
		String result;
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		val = sc.nextInt();
		
		result = val % 2 == x ? "¦��" : "Ȧ��";
		System.out.println("�ش� ���ڴ� " + result + "�Դϴ�." );
	}
}
		


/*
3. ����ڷκ��� ������ ������ �Է¹޾� 
������ ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �����Ѵ�. 
 ��, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
���� ��)
���� �Է� : 5
��� : Ȧ��
*/

