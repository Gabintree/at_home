package JavaStart;

public class TenMultiple {

	public static void main(String[] args) {
		
		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 10 == 0) {
				System.out.println("1���� " + i + "������ ���� : " + sum);
			}
		}
	}
}


/*
16. 1���� 100������ ������ ���� ���ϵ� 10�� ����� �� ������ ����� ����ϴ� ���α׷��� �����Ѵ�.
���� ��)
1 ~  10 ������ �� : xx
1 ~  20 ������ �� : xx
1 ~  30 ������ �� : xx
1 ~ 100 ������ �� : xxxx
*/
