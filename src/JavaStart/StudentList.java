package JavaStart;
import java.util.Scanner;
public class StudentList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� �ο� ���� �Է��ϼ���.");
	
		int num = sc.nextInt();	
		String[] name = new String[num];
		String[] phone= new String[num];

		for(int i = 0; i < num; i++) {
			System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���.(�������� ����)");
			name[i] = sc.next();
			phone[i] = sc.next();
		}
			
		System.out.println("---------------------");
		System.out.println("��ü �л� ��  : "+num+"��");
		System.out.println("---------------------");
		System.out.println("�̸�" + "\t" + "��ȭ��ȣ");
		
		for(int i = 0; i < num; i++) {
			System.out.printf(name[i] + "\t" + phone[i] + "\n");
		}
		System.out.println("---------------------");
	}
}
/*
23. ����ڷκ��� ó�� �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް� 
�Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�. 
��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
���� ��)
�Է� ó���� �л� �� �Է�(��) : 3
�̸� ��ȭ��ȣ �Է�[1](���鱸��) : �賯�� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���鱸��) : ��޽� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���鱸��) : ���� 010-3333-3333
--------------------------------
��ü �л� �� : 3��
--------------------------------
�̸�		��ȭ��ȣ
�賯��	010-1111-1111
��޽�	010-2222-2222
����	010-3333-3333
--------------------------------
*/
