package JavaStart;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Year yr = new Year();
		System.out.println("Ȯ���� ������ �Է��ϼ���.");
		int y1 = sc.nextInt();
		yr.define(y1);
	}
}
class Year {
		
	int y1;
		
	public void define(int y1) {
				
		if(y1 % 400 == 0 || y1 % 4 == 0 && y1 % 100 != 0) {
			System.out.println("����");
		}else {System.out.println("���");
		}
	}	
}

/*
 5. ����ڷκ��� ������ ������ �Է¹޾� 
������ �������� ������� �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
������ �⵵ �Է� : 2000
��� : ����
�� ���� ��� ������ 4�� ������ �������� �ش� �켱 �������� �ϰ�, 
�� �� �߿��� 100���� ������ �������� �ش� ������� �ϸ�, 
�� �ٸ� 400���� ������ ���������ش� �ٽ� �������� ���Ͽ���. 
*/
