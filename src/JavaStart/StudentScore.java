package JavaStart;
import java.util.Scanner;
public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
				
		System.out.println("�л� ���� �Է��ϼ���");
		num = sc.nextInt();
		int[] arr = new int[num];
				
		for(int i = 0; i < num; i++ ) {
			System.out.print(i+1 +"�� �л��� ���� �Է� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg = (double)sum / num;
		
		System.out.println("�� : "+ sum);
		System.out.println("��� : "+ avg);
	}
}
