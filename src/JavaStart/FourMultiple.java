package JavaStart;

public class FourMultiple {

	public static void main(String[] args) {
	
		int i;
			
		for(i = 1; i <= 100; i++) {
			
			if(i % 4 == 0) {
				System.out.printf("%d  ", i, '\t');
			}
			if(i % 20 == 0) {
				System.out.println();
			}
		}
	}
}

/*
21. 1���� 100������ �� �߿��� 4�� ����� ����ϴ� ���α׷��� �����Ѵ�. 
��, �� �ٿ� 5���� ����� �� �ֵ��� �Ѵ�.
���� ��)
4    8    12    16    20
24   28    32    36    40
44   48    52    56    60
64   68    72    76    80
84   88    92    96    100
            :
*/


/*		int j = 0; // 5���� ���� ����
		for(int i = 1; i <= 100; i++) {
			
			if(i % 4 == 0) {
				j++;
				System.out.printf("%d ", i ,'\t');
			}
			if(j == 5) {
				System.out.println();
				j = 0;
			}
		}
	}
}
*/ //��� ��ǰ
