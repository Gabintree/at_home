package JavaStart;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarMonday { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
        
		System.out.println("������ Ȯ���ϰ� ���� ��¥�� �� �� �� ������ ���ڸ� �Է��ϼ���.(���� �ʼ�)");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int daynum;
				
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day-1);

		daynum = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] wk = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.printf(wk[daynum-1]+"����");
		
	}
}



/*
25. �޷� ����� ~ 
����ڷκ��� ��, ��, ���� �Է¹޾� ������ ����ϴ� ���α׷�
���� ��) 
�� �� �� �Է�(���鱸��) : 1992 8 2
1992�� 8�� 2�� �� �Ͽ���
*/
