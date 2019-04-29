package JavaStart;
import java.util.Calendar;
import java.util.Scanner;
public class UnchangeCalendarDW {

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Calendar cal = Calendar.getInstance();
	      
	      System.out.println("해당 년 월을 입력해주세요. ex. 2019 04");
	      int year = sc.nextInt();
	      int month = sc.nextInt()-1;
	      
	      cal.set(year, month, 1);
	      
	      int startDay = cal.get(Calendar.DAY_OF_WEEK);
	      
	      System.out.println("\n" + year + "년 " + (month+1) + "월");
	      System.out.println("---------------------------------------------------");
	      System.out.println("일\t월\t화\t수\t목\t금\t토");
	      System.out.println("---------------------------------------------------");
	      
	      for(int i = 0; i < startDay-1; i++) {
	    	  System.out.print("\t");
	      }
	      for(int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH);i++) {
	    	  System.out.print( i + "\t");
	          	if(startDay % 7 == 0) {
	          		System.out.println();
	          	}
	          	startDay++;
	      }
	      System.out.println("\n-------------------------------------------------");
	      sc.close();
	   }
}
