package JavaStart;

import java.util.Scanner;

public class ASC {

	public static void main(String[] args) {
	
		int[] arr = new int[3];	
		int tmp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է� �ϼ���");
		arr[0] = sc.nextInt();
		System.out.println("�� ��° ������ �Է� �ϼ���");
		arr[1] = sc.nextInt();
		System.out.println("�� ��° ������ �Է� �ϼ���");
		arr[2] = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
		System.out.println("������������ ���");
		for(int i = 0; i < 3;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}



/*
9. ����ڷκ��� ������ ������ �Է¹޾� ���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.
���� ��)
ù ��° ���� �Է� : 16
�� ��° ���� �Է� : 8
�� ��° ���� �Է� : 21
���� ��� :  8 16 21

*/