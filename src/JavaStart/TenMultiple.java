package JavaStart;

public class TenMultiple {

	public static void main(String[] args) {
		
		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 10 == 0) {
				System.out.println("1부터 " + i + "까지의 합은 : " + sum);
			}
		}
	}
}


/*
16. 1부터 100까지의 정수의 합을 구하되 10의 배수가 될 때마다 결과를 출력하는 프로그램을 구현한다.
실행 예)
1 ~  10 까지의 합 : xx
1 ~  20 까지의 합 : xx
1 ~  30 까지의 합 : xx
1 ~ 100 까지의 합 : xxxx
*/
