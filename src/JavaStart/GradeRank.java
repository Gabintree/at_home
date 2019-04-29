package JavaStart;
import java.util.Scanner;
public class GradeRank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int score;
				
		System.out.println("인원 수를 입력하세요. ");
		int num = sc.nextInt();
		
		String[] na = new String[num];
		int[] scr = new int[num];
				
		for(int i = 0; i < na.length; i++) {
			System.out.print("이름, 점수 입력 : ");
			na[i]=sc.next();
			scr[i]= sc.nextInt();
		}
		for(int i = 0; i < na.length-1; i++) {
			for(int j = 0; j < na.length-1-i; j++) {
				if(scr[j] < scr[j+1]) {
					int tmpS = scr[j]; 
					String tmpN = na[j];
					scr[j] = scr[j+1];
					na[j] = na[j+1];
					scr[j+1] = tmpS;
					na[j+1] = tmpN;
				}
			}
		}
			System.out.println("-----------------------------");
			for(int k = 0; k < na.length; k++) {
			System.out.println(k+1 + "등 : " + na[k] + " " + scr[k]);
			}
			System.out.println("-----------------------------");
	}
}
/*
29. 사용자로부터 여러 학생의 성적 정보를 입력받아 
점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다. 
단, 정렬 알고리즘을 활용
실행 예)
인원 수 입력 : 5
이름 점수 입력(1) : 김베리 90
이름 점수 입력(2) : 김살라 80
이름 점수 입력(3) : 김지단 85
이름 점수 입력(4) : 김피구 75
이름 점수 입력(5) : 김제코 95
-------------
1등 김제코 95
2등 김베리 90
3등 김지단 85
4등 김살라 80
5등 김피구 75
-------------
*/
