package JavaStart;
import java.util.Scanner;
public class SubjectScore {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Grade gr = new Grade();
		
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		
		gr.each(name, kor, eng, math);
		gr.sumavg();
	}
}
class Grade {
	
	String name;
	int kor, eng, math;
	
	public void each(String name, int kor, int eng, int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 국어 점수는 %d점 입니다.\n", kor);
		System.out.printf("당신의 영어 점수는 %d점 입니다.\n", eng);
		System.out.printf("당신의 수학 점수는 %d점 입니다.\n", math);
	}
	public void sumavg() {
		
		int sum = kor+eng+math;
		double avg = (double)sum / 3;

		System.out.printf("총점은 %d이고, 평균은 %.1f점 입니다.\n", sum, avg);
		
		if(avg >= 90) {
			System.out.printf("등급은 %c 입니다.\n", 'A');
		}else if(avg >= 80){
			System.out.printf("등급은 %c 입니다.\n", 'B');
		}else if(avg >= 70){
			System.out.printf("등급은 %c 입니다.\n", 'C');
		}else if(avg >= 60){
			System.out.printf("등급은 %c 입니다.\n", 'D');
		}else {System.out.printf("등급은 %c 입니다.\n", 'F');
     	}
	}
}
/*
7. 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아 다음과 같은 형태로 
출력하는 프로그램을 작성한다. 
단, 출력은 printf() 메소드를 통해 출력한다.
실행 예)
이름 입력 : 김매드
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70
당신의 이름은 김매드입니다.
국어 점수는 90,
영어 점수는 80,
수학 점수는 70,
총점은 240이고, 평균은 80입니다.
등급은 B입니다.
*/