package JavaStart;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		int data;
		
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("1���� 3���� ���� �߿��� �ϳ��� �Է��Ͻÿ�.");
		data = sc.nextInt();
		
		switch(data)
		{
		case 1 : 
			System.out.println("��");
			break;
		case 2 : 
			System.out.println("�ڡ�");
			break;
		case 3 : 
			System.out.println("�ڡڡ�");
			break;
		}
	}

}

/*
12. 1���� 3������ ������ �ϳ��� ����ڷκ��� �Է¹޾� 
�Է¹��� ������ŭ �����ڰ� ��µǴ� ���α׷��� �����. 
��, switch���� �̿��Ѵ�.
���� ��)
������ ���� �Է�(1~3) : 3
�ڡڡ�
 */

