package JavaStart;
import java.util.Scanner;
public class UnchangedCalendar {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달력의 년과 월을 차럐로 입력하세요 (ex. '2019 03')");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		Cld cd = new Cld(year, month);
		
		cd.printCalendat();
	}
}
class Cld{
 
	int year;
		int month;
		private int[] mondays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean isLeap = false;
		int lastday = 0;
		int week;
	
	public Cld(int year, int month) {
		if(month < 1 || month > 12) {
			new Exception();
		}
		this.year = year;
		this.month = month;
		isLeap();
		}
	private void isLeap() {
		if(this.year % 400 == 0||(this.year % 4 ==0 && this.year % 100 != 0)) {
			this.isLeap = true; 
			return;
		}this.isLeap = false;
	}
	public int getWeek() {
		int alldays = ((year-1)*365) + calcLeap()+1;
		
		for(int i = 0; i < month; i++) {
			alldays += mondays[i];
			if(isLeap && i == 2) {
				alldays += 1;
			}
		}
		week = (alldays % 7) +1;
		return week;
	}
	private int calcLeap() {
		return ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400);
	}
	public int getLastday() {
		lastday = mondays[month];
		if(isLeap && month == 2) {
			lastday +=1;
		}return lastday;
	}
	public void printCalendat() {
		
	      getWeek();
	      getLastday(); int weekTemp = week;
	      System.out.println("일\t월\t화\t수\t목\t금\t토");
	      for(int i = 1; i < weekTemp; i++) {
	         System.out.print("\t");    
	      }
	      for(int i = 1; i <= lastday; i++) {
	         System.out.print(i + "\t");
	         
	         if(weekTemp % 7 == 0 ) 
	         System.out.println();
	         weekTemp++;
	      
			}
		}
	}
/*
28. 만년 달력 만들기
https://blog.naver.com/pas2341/220974599039
*/