package JavaStart;
import java.util.Scanner;
public class ReceiveHap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("합을 구할 정수를 입력하세요.");
		int re = sc.nextInt();
		int resum = 0 , evensum = 0 , oddsum = 0 ;
		
		if(re != 0){
			for(int i = 1; i<=re; i++) {
				resum += i;								
			}
			for(int i = 1; i<=re; i++) {
				if( i % 2 == 0) {
					evensum += i;	
				}else {oddsum += i;}
			}
		}
		System.out.println("1부터 " + re + "까지 정수의 합은 " + resum);
		System.out.println("1부터 " + re + "까지 짝수의 합은 " + evensum);
		System.out.println("1부터 " + re + "까지 홀수의 합은 " + oddsum);
	}
}


/*
18. 사용자로부터 임의의 정수를 입력받아 
1부터 그 수 까지의 전체 합과, 짝수의 합과 홀수의 합을 
각각 결과값으로 출력하는 프로그램을 구현한다.
실행 예)
// 실행 예)
임의의 정수 입력 : 270
1~270 까지의 정수의 합은 : xxx
1~270 까지의 짝수의 합은 : xxx
1~270 까지의 홀수의 합은 : xxx
*/