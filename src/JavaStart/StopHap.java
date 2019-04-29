package JavaStart;
import java.util.Scanner;
public class StopHap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int i = 1;
		while(true) {
			System.out.print(i + "번째 정수입력 (-1 종료) : ");
			num = sc.nextInt();
			sum += num;
			i++;
			if(num == -1) {
				System.out.println("지금까지 입력된 정수의 합 : " + (sum+1));
				break;
			}
		}
	}
}

/*
20. 사용자로부터 여러 개의 정수를 입력받아 그 합을 계산하여 결과를 출력해주는 프로그램을 구현한다. 
단, 사용자가 [-1]을 입력 시 입력받는 행위를 중지하고 그 동안 입력받아둔 정수들의 합을 출력할 수 있도록 구현한다.
실행 예)
1번째 정수 입력(-1 종료) : 10
2번째 정수 입력(-1 종료) : 10
3번째 정수 입력(-1 종료) : 5
4번째 정수 입력(-1 종료) : 8
5번째 정수 입력(-1 종료) : 9
6번째 정수 입력(-1 종료) : -1
현재까지 입력된 정수의 합 : 42
*/

