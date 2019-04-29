package JavaStart;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Year yr = new Year();
		System.out.println("확인할 연도를 입력하세요.");
		int y1 = sc.nextInt();
		yr.define(y1);
	}
}
class Year {
		
	int y1;
		
	public void define(int y1) {
				
		if(y1 % 400 == 0 || y1 % 4 == 0 && y1 % 100 != 0) {
			System.out.println("윤년");
		}else {System.out.println("평년");
		}
	}	
}

/*
 5. 사용자로부터 임의의 연도를 입력받아 
연도가 윤년인지 평년인지 판별하여 결과를 출력하는 프로그램을 구현한다.

실행 예)
임의의 년도 입력 : 2000
결과 : 윤년
① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, 
② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
③ 다만 400으로 나누어 떨어지는해는 다시 윤년으로 정하였다. 
*/
