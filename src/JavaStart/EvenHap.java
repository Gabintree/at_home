package JavaStart;

public class EvenHap {

	public static void main(String[] args) {
	
		int sum = 0;
		
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum +i;
			}
		}
		System.out.println("1���� 100���� ¦���� ���� : " + sum + " �Դϴ�.");
	}
}

/*
14. 1���� 100������ ���� �߿��� ¦������ ���� ����Ͽ� ������� ����ϴ� ���α׷��� �����Ѵ�.
���� ��)
1 ���� 100 ������ �� �߿��� ¦���� �� : xxx
*/