package JavaStart;
import java.util.Scanner;
public class ReceiveHap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ������ �Է��ϼ���.");
		int re = sc.nextInt();
		int resum = 0 , evensum = 0 , oddsum = 0 ;
		
		if(re != 0){
			for(int i = 1; i<=re; i++) {
				resum += i;								
			}
			for(int i = 1; i<=re; i++) {
				if( i % 2 == 0) {
					evensum += i;	
				}else {oddsum += i;}
			}
		}
		System.out.println("1���� " + re + "���� ������ ���� " + resum);
		System.out.println("1���� " + re + "���� ¦���� ���� " + evensum);
		System.out.println("1���� " + re + "���� Ȧ���� ���� " + oddsum);
	}
}


/*
18. ����ڷκ��� ������ ������ �Է¹޾� 
1���� �� �� ������ ��ü �հ�, ¦���� �հ� Ȧ���� ���� 
���� ��������� ����ϴ� ���α׷��� �����Ѵ�.
���� ��)
// ���� ��)
������ ���� �Է� : 270
1~270 ������ ������ ���� : xxx
1~270 ������ ¦���� ���� : xxx
1~270 ������ Ȧ���� ���� : xxx
*/