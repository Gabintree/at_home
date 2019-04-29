package JavaStart;

public class EvenHap {

	public static void main(String[] args) {
	
		int sum = 0;
		
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum +i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합은 : " + sum + " 입니다.");
	}
}

/*
14. 1부터 100까지의 정수 중에서 짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
실행 예)
1 부터 100 까지의 수 중에서 짝수의 합 : xxx
*/