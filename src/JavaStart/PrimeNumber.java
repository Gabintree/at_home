package JavaStart;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt=0;
		System.out.println("Ȯ���� ������ �Է����ּ���.");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
			if(cnt == 2) {
				System.out.println("�Ҽ��Դϴ�.");
			}else {System.out.println("�Ҽ��� �ƴմϴ�.");}
	}
}




/*
17. ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.
���� ��)
������ ���� �Է� : 10
10 -> �Ҽ� �ƴ�
������ ���� �Է� : 11
11 -> �Ҽ�
*/

	
/*	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int num;
	      System.out.println("�Է���");
	      num = sc.nextInt();
	      
	      for(int i = 2; i < num; i++) {
	         if(num % i == 0) {
	            System.out.println("�Ҽ��� �ƴմϴ�.");
	            break;
	         }
	         if (i == num -1) {
	            System.out.println("�Ҽ��Դϴ�.");
	         }
	      }
	  }
}
*/ //��� ��ǰ   