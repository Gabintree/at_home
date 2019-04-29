package JavaStart;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      Random rd = new Random();
      
      String user_game = new String();  //???오..????
      String com_game = new String();    //String user_game; 와 같다. 
      boolean flag = true;
      
      while(flag) {
    	 System.out.println("가위 바위 보 중에서 하나를 입력 해주세요. 종료는 종료");
         String user = sc.next();
        
         int com = rd.nextInt(3)+1;   // 1,2,3만 나오게 하려고
         int hangle = 0;
         
         if(user.equals("가위")) {
            hangle = 1;
         }else if(user.equals("바위")) {
            hangle = 2;
         }else if(user.equals("보")) {
            hangle = 3;
         }
                              
         user_game = Result(hangle);  // result 매소드???
         com_game = Result(com);
            
         if(user.equals("종료")) {
        	 System.out.println("게임을 종료하겠습니다."); break;
         }
         else if(hangle == com) {
            System.out.println("컴퓨터 : " + Result(com) + "\n" + "사용자 : " + Result(hangle) + "\n" + "비겼습니다.");
         }
         else if(hangle==1 && com==2 || hangle==2 && com==3 || hangle==3 && com ==1) {
            System.out.println("컴퓨터 : " + Result(com) + "\n" + "사용자 : " + Result(hangle) + "\n" + "졌습니다.");
         }
         else if(hangle == 1 && com == 3 || hangle == 2 && com == 1 || hangle == 3 && com ==2 ) {
         System.out.println("컴퓨터 : " + Result(com) + "\n" + "사용자 : " + Result(hangle) + "\n" + "이겼습니다.");
         }else {System.out.println("다시 입력하세요!!! ");}
         
         System.out.println("===================================");
      }
      sc.close();   
   }


   private static String Result(int input) {
      if(input == 1) {
         return "✌";
      }else if(input == 2) {
         return "✊";
      }else {
         return "✋";
      }
   }

   }

/*
27번 가위 바위 보 게임
참조 블로그 : https://blog.naver.com/ohkk0217/221470733944
*/