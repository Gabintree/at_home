package JavaStart;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle cc = new Circle();
		
		System.out.println("���ϴ� �������� ���̸� �Է��Ͻÿ�");
		cc.r = sc.nextDouble(); //Ʋ�ȴ� �κ� ! ����. 
		
		cc.getArea();
		cc.getCircum();
	}
}
class Circle {
	final double PI = 3.14;
	double r ;
	
	public void setRadius(double r) {
		this.r = r;
	}
	public void getArea() {
		double getArea = r*r*PI;
		System.out.println("�ش� ���� ���̴� : " + getArea);
	}
	public void getCircum() {
		double getCircum = r * 2 * PI;
		System.out.println("�ش� ���� �ѷ��� : " + getCircum);
	}
}
	


/*
1. ������ �ο��� ������ ������ ���� ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��ϰ�
����ڷκ��� �������� �Է¹޾� ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ѵ�.
���� ��)
������ : 10
���� : xxxx
�ѷ� : xxxx 
*/