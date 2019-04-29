package JavaStart;
import java.util.Scanner;
public class StudentList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 인원 수를 입력하세요.");
	
		int num = sc.nextInt();	
		String[] name = new String[num];
		String[] phone= new String[num];

		for(int i = 0; i < num; i++) {
			System.out.println("이름과 전화번호를 입력하세요.(공백으로 구분)");
			name[i] = sc.next();
			phone[i] = sc.next();
		}
			
		System.out.println("---------------------");
		System.out.println("전체 학생 수  : "+num+"명");
		System.out.println("---------------------");
		System.out.println("이름" + "\t" + "전화번호");
		
		for(int i = 0; i < num; i++) {
			System.out.printf(name[i] + "\t" + phone[i] + "\n");
		}
		System.out.println("---------------------");
	}
}
/*
23. 사용자로부터 처음 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고 
입력받은 내용을 전체 출력하는 프로그램을 구현한다. 
단, 배열을 활용하여 처리할 수 있도록 한다.
실행 예)
입력 처리할 학생 수 입력(명) : 3
이름 전화번호 입력[1](공백구분) : 김날두 010-1111-1111
이름 전화번호 입력[2](공백구분) : 김메시 010-2222-2222
이름 전화번호 입력[3](공백구분) : 김살라 010-3333-3333
--------------------------------
전체 학생 수 : 3명
--------------------------------
이름		전화번호
김날두	010-1111-1111
김메시	010-2222-2222
김살라	010-3333-3333
--------------------------------
*/
