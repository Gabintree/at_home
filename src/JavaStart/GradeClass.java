package JavaStart;
import java.util.Scanner;
public class GradeClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л��� �̸��� ����, ����, ���� ������ ���ʷ� �Է��ϼ���(�������� ����)");
		
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
		System.out.println("������ : " + sum);
		System.out.println("����� : " + avg);
	}
}
	
/*
26. �л��� ��������, ��������, ���������� �Է¹޾� ����, ����� ����ϴ� ���α׷��� �����Ѵ�. 
��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. 
���α׷��� �����ϴ� Ŭ����

1. Sungjuk Ŭ����
   �̸�, ��������, ��������, ���������� �Է¹ް� ������ ����� �����ϴ� Ŭ������ ������ ��
    - �Ӽ� : 
    - ��� : �� ������ �Է�, ����/��� ����, ��� ���
2. Test093 Ŭ����
    main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ����
*/
