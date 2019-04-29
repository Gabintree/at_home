package JavaStart;
import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단의 단수를 입력하세요");
		
		while(true) {
			int dan = sc.nextInt();
			
			if(dan <= 9 && dan > 0) {
				for(int i = dan; i == dan; i++) {
					for(int j = 1; j <= 9; j++) {
					System.out.println(i+" x "+j+" = "+ i*j);
					}
				}	 
			}else {System.out.println("1부터 9사이 값을 입력하세요");
		    	}	
		}
	}
}

/*
19. 사용자로부터 원하는 구구단을 입력받아 해당하는 구구단을 출력하는 프로그램을 구현한다.
단, 1단 ~9단 사이의 수를 입력받은 상황이 아니라면 프로그램을 종료해 버릴 수 있도록 처리한다.
*/
