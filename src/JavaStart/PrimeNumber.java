package JavaStart;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt=0;
		System.out.println("확인할 정수를 입력해주세요.");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
			if(cnt == 2) {
				System.out.println("소수입니다.");
			}else {System.out.println("소수가 아닙니다.");}
	}
}




/*
17. 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 소수인지 아닌지를 판별하여
결과를 출력하는 프로그램을 구현한다.
실행 예)
임의의 정수 입력 : 10
10 -> 소수 아님
임의의 정수 입력 : 11
11 -> 소수
*/

	
/*	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int num;
	      System.out.println("입력해");
	      num = sc.nextInt();
	      
	      for(int i = 2; i < num; i++) {
	         if(num % i == 0) {
	            System.out.println("소수가 아닙니다.");
	            break;
	         }
	         if (i == num -1) {
	            System.out.println("소수입니다.");
	         }
	      }
	  }
}
*/ //동운씨 작품   