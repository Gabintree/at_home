package JavaStart;
import java.util.Scanner;
public class Calculator {
		public static void main(String[] args) {
		
		double num1, num2;
		String opr;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ù��° ���� �Է��ϼ���.");
		num1 = sc.nextDouble();
		System.out.println("������ �ι�° ���� �Է��ϼ���.");
		num2 = sc.nextDouble();
		System.out.println("�����ڸ� �Է��ϼ���. [+, -, *, /] �� ����");
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
		System.out.println("��� ���� " + num1 + num2);
	}
	public void sub() {
		System.out.println("��� ���� " + (num1 - num2));
	}
	public void mul() {
		System.out.println("��� ���� " + num1 * num2);
	}
	public void div() {
		System.out.println("��� ���� " + num1 / num2);
	}
}

/*
2. ����ڷκ��� ������ �� �� �Է¹޾� 
��Ģ���� �� ������ ������ �����Ͽ� 
����� ����ϴ� ���α׷��� �ۼ��Ѵ�. 
���� ��)
ù ��° ���� �Է� : 
�� ��° ���� �Է� : 
��� : (+ - * /)
*/