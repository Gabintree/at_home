package JavaStart;
import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �������� �ܼ��� �Է��ϼ���");
		
		while(true) {
			int dan = sc.nextInt();
			
			if(dan <= 9 && dan > 0) {
				for(int i = dan; i == dan; i++) {
					for(int j = 1; j <= 9; j++) {
					System.out.println(i+" x "+j+" = "+ i*j);
					}
				}	 
			}else {System.out.println("1���� 9���� ���� �Է��ϼ���");
		    	}	
		}
	}
}

/*
19. ����ڷκ��� ���ϴ� �������� �Է¹޾� �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
��, 1�� ~9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶�� ���α׷��� ������ ���� �� �ֵ��� ó���Ѵ�.
*/
