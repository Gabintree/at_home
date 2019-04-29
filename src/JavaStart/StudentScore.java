package JavaStart;
import java.util.Scanner;
public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
				
		System.out.println("학생 수를 입력하세요");
		num = sc.nextInt();
		int[] arr = new int[num];
				
		for(int i = 0; i < num; i++ ) {
			System.out.print(i+1 +"번 학생의 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg = (double)sum / num;
		
		System.out.println("합 : "+ sum);
		System.out.println("평균 : "+ avg);
	}
}
