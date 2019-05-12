package JavaStart;
import java.util.Scanner;
public class Calculator {
		public static void main(String[] args) {
		
		double num1, num2;
		String opr;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("연산할 첫번째 값을 입력하세요.");
		num1 = sc.nextDouble();
		System.out.println("연산할 두번째 값을 입력하세요.");
		num2 = sc.nextDouble();
		System.out.println("연산자를 입력하세요. [+, -, *, /] 중 택일");
		opr = sc.next();
		
		Calcul cc = new Calcul(num1, num2);
		
		if(opr.equals("+")) {
			cc.add();
		}else if(opr.equals("-")) {
			cc.sub();
		}else if(opr.equals("*")) {
			cc.mul();
		}else if(opr.equals("/")) {
			cc.div();
		}
	}	
}
class  Calcul {
	double num1, num2;
	public Calcul(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		System.out.println("결과 값은 " + num1 + num2);
	}
	public void sub() {
		System.out.println("결과 값은 " + (num1 - num2));
	}
	public void mul() {
		System.out.println("결과 값은 " + num1 * num2);
	}
	public void div() {
		System.out.println("결과 값은 " + num1 / num2);
	}
}

/*
2. 사용자로부터 정수를 두 번 입력받아 
사칙연산 및 나머지 연산을 수행하여 
결과를 출력하는 프로그램을 작성한다. 
실행 예)
첫 번째 정수 입력 : 
두 번째 정수 입력 : 
결과 : (+ - * /)
*/