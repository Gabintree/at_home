package JavaStart;
import java.util.Scanner;
public class GradeRank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int score;
				
		System.out.println("�ο� ���� �Է��ϼ���. ");
		int num = sc.nextInt();
		
		String[] na = new String[num];
		int[] scr = new int[num];
				
		for(int i = 0; i < na.length; i++) {
			System.out.print("�̸�, ���� �Է� : ");
			na[i]=sc.next();
			scr[i]= sc.nextInt();
		}
		for(int i = 0; i < na.length-1; i++) {
			for(int j = 0; j < na.length-1-i; j++) {
				if(scr[j] < scr[j+1]) {
					int tmpS = scr[j]; 
					String tmpN = na[j];
					scr[j] = scr[j+1];
					na[j] = na[j+1];
					scr[j+1] = tmpS;
					na[j+1] = tmpN;
				}
			}
		}
			System.out.println("-----------------------------");
			for(int k = 0; k < na.length; k++) {
			System.out.println(k+1 + "�� : " + na[k] + " " + scr[k]);
			}
			System.out.println("-----------------------------");
	}
}
/*
29. ����ڷκ��� ���� �л��� ���� ������ �Է¹޾� 
������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�. 
��, ���� �˰����� Ȱ��
���� ��)
�ο� �� �Է� : 5
�̸� ���� �Է�(1) : �躣�� 90
�̸� ���� �Է�(2) : ���� 80
�̸� ���� �Է�(3) : ������ 85
�̸� ���� �Է�(4) : ���Ǳ� 75
�̸� ���� �Է�(5) : ������ 95
-------------
1�� ������ 95
2�� �躣�� 90
3�� ������ 85
4�� ���� 80
5�� ���Ǳ� 75
-------------
*/
