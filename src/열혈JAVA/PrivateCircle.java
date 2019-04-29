package ����JAVA;

public class PrivateCircle {

	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
	//	c.rad = -4.5;   **�������� : �Լ��� ���ؼ��� ������ �� �ֵ��� ������..!!
		System.out.println(c.getArea());
	}
}

class Circle{
	private double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r < 0 ) {
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return (rad * rad) * PI;
	}
}