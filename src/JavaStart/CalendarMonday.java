package JavaStart;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarMonday { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
        
		System.out.println("요일을 확인하고 싶은 날짜를 년 월 일 순으로 숫자만 입력하세요.(공백 필수)");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int daynum;
				
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day-1);

		daynum = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] wk = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.printf(wk[daynum-1]+"요일");
		
	}
}



/*
25. 달력 만들기 ~ 
사용자로부터 년, 월, 일을 입력받아 요일을 출력하는 프로그램
실행 예) 
년 월 일 입력(공백구분) : 1992 8 2
1992년 8월 2일 → 일요일
*/
