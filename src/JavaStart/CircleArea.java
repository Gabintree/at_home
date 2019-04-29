package JavaStart;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle cc = new Circle();
		
		System.out.println("원하는 반지름의 길이를 입력하시오");
		cc.r = sc.nextDouble(); //틀렸던 부분 ! 주의. 
		
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
		System.out.println("해당 원의 넓이는 : " + getArea);
	}
	public void getCircum() {
		double getCircum = r * 2 * PI;
		System.out.println("해당 원의 둘레는 : " + getCircum);
	}
}
	


/*
1. 사전에 부여된 반지름 정보를 통해 원의 넓이와 둘레를 구하는 프로그램을 작성하고
사용자로부터 반지름을 입력받아 원의 넓이와 둘레를 구하는 프로그램도 작성한다.
실행 예)
반지름 : 10
넓이 : xxxx
둘레 : xxxx 
*/