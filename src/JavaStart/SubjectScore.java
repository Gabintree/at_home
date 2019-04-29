package JavaStart;
import java.util.Scanner;
public class SubjectScore {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Grade gr = new Grade();
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.println("���� ������ �Է��ϼ���.");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
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
		
		System.out.printf("����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf("����� ���� ������ %d�� �Դϴ�.\n", kor);
		System.out.printf("����� ���� ������ %d�� �Դϴ�.\n", eng);
		System.out.printf("����� ���� ������ %d�� �Դϴ�.\n", math);
	}
	public void sumavg() {
		
		int sum = kor+eng+math;
		double avg = (double)sum / 3;

		System.out.printf("������ %d�̰�, ����� %.1f�� �Դϴ�.\n", sum, avg);
		
		if(avg >= 90) {
			System.out.printf("����� %c �Դϴ�.\n", 'A');
		}else if(avg >= 80){
			System.out.printf("����� %c �Դϴ�.\n", 'B');
		}else if(avg >= 70){
			System.out.printf("����� %c �Դϴ�.\n", 'C');
		}else if(avg >= 60){
			System.out.printf("����� %c �Դϴ�.\n", 'D');
		}else {System.out.printf("����� %c �Դϴ�.\n", 'F');
     	}
	}
}
/*
7. ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾� ������ ���� ���·� 
����ϴ� ���α׷��� �ۼ��Ѵ�. 
��, ����� printf() �޼ҵ带 ���� ����Ѵ�.
���� ��)
�̸� �Է� : ��ŵ�
���� ���� : 90
���� ���� : 80
���� ���� : 70
����� �̸��� ��ŵ��Դϴ�.
���� ������ 90,
���� ������ 80,
���� ������ 70,
������ 240�̰�, ����� 80�Դϴ�.
����� B�Դϴ�.
*/