package JavaStart;
import java.util.Scanner;
public class GradeClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 이름과 국어, 영어, 수학 점수를 차례로 입력하세요(공백으로 구분)");
		
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Sungjuk sj = new Sungjuk(name, kor, eng, math);
		
		sj.setScore();
		sj.getScore();
	}
}
class Sungjuk {
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public Sungjuk(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setScore() {
		 sum = kor+eng+math;
		 avg = (double)sum / 3;
	}
		
	public void getScore() {
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + avg);
	}
}
	
/*
26. 학생의 국어점수, 영어점수, 수학점수를 입력받아 총점, 평균을 계산하는 프로그램을 구현한다. 
단, 클래스의 개념을 활용하여 작성할 수 있도록 한다. 
프로그램을 구성하는 클래스

1. Sungjuk 클래스
   이름, 국어점수, 영어점수, 수학점수를 입력받고 총점과 평균을 산출하는 클래스로 설계할 것
    - 속성 : 
    - 기능 : 상세 데이터 입력, 총점/평균 연산, 결과 출력
2. Test093 클래스
    main() 메소드가 존재하는 외부 클래스로 설계
*/
