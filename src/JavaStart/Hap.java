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
		System.out.println("짝수의 합은 " + evensum);
		System.out.println("홀수의 합은 " + oddsum);
	}
}


/*
15. 1부터 100까지의 정수 중에서 짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다. 
그리고 그 결과값을 출력하는 프로그램을 구현한다.
실행 예)
1부터 100까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
*/
