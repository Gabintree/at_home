package JavaStart;

import java.util.Scanner;

public class ThreeOper {

	public static void main(String[] args) {
	
		int val;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ������ �Է��ϼ���.");
		val = sc.nextInt();
		
		result = val > 0 ? "���" : "����";
	
		if(val == 0) {
		result = "0";
		System.out.println(result);
		}else {System.out.println(result);
		}
	}
}



/*
4. ����ڷκ��� ������ ������ �Է¹޾� 
 ������ �������, ��������, 0���� �����Ͽ� ����� ����ϴ� ���α׷��� ���Ͻÿ�. 
 ��, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.
 
���� ��)
������ ���� �Է� : -12
��� : ����
*/
