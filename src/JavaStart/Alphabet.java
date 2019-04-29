package JavaStart;

import java.io.IOException;

public class Alphabet {

	public static void main(String[] args) throws IOException {
	
		int n;
		System.out.println("알파벳 한 문자를 입력해 주세요.");
		n = System.in.read(); // 한 바이트씩 읽어옴, 아스키코드 값을 반환함.
		
		if((n==65 ||n==69 ||n==73 ||n==79 ||n==85) || //65 A,69 E, 73 I, 79 O, 85 U,  
		(n==97 ||n==101 ||n==105 ||n==111 ||n==127))  // 97 a, 101 e, 105 i, 111 o, 117 u,
		{
			System.out.println("모음 OK ~!!!");
		}else if(n<=64 || n>123) 
		{	//64까지 숫자와 기호들, 64보다 작거나 같으면 입력오류 OR 123보다 크면 알파벳이 아니므로 입력오류
			System.out.println("입력 오류~!!!");
		}else {System.out.println("자음 입니다.");
		}
	}
}

/*
10. 사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여 
입력받은 알파벳이 모음일 경우만 결과를 출력하는 프로그램을 작성한다. 
단, 대소문자를 모두 적용할 수 있도록 처리한다. 
또한, 알파벳 이외의 문자가 입력되었을 경우 입력 오류에 대한 내용을 사용자에게 안내해줄 수 있도록 한다.
실행 예)
알파벳 한 문자 입력 : A
모음 ok~!!!
알파벳 한 문자 입력 : 1
입력 오류~!!!
*/

/* class Alphabet{
	
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("알파벳 입력");
	      char c = sc.next().charAt(0);
	      
	      int n = (int) c;
	      
	      if((n==65 || n==69 || n==73 || n==79 || n==85 || n==87) ||
	           ( n==97 || n==101 || n==111 || n==127 || n==129))
	      {
	         System.out.println("모음 오케이");
	      } else if (n <= 64 || n > 123) {
	         System.out.println("입력 오류!!");
	      }  System.out.println("알파벳");
	      }
	   }
*/ //동운씨가 만든 소스 코딩 

	
	
	
