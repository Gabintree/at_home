package JavaStart;

public class Hap {

	public static void main(String[] args) {
		
		int evensum = 0;
		int oddsum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				evensum += i;
			}else {oddsum += i;}
		}
		System.out.println("¦���� ���� " + evensum);
		System.out.println("Ȧ���� ���� " + oddsum);
	}
}


/*
15. 1���� 100������ ���� �߿��� ¦������ �հ� Ȧ������ ���� ���� �����Ͽ� ����Ѵ�. 
�׸��� �� ������� ����ϴ� ���α׷��� �����Ѵ�.
���� ��)
1���� 100������ ���� ��
¦���� �� : 2550
Ȧ���� �� : 2500
*/
