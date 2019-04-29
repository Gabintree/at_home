package JavaStart;

public class CalTest{
	public static void main(String[] args){
		Cal c1 = new Cal(); // Cal 클래스 객체 생성

	    c1.addPrint(10, 2); // 12 출력
	    System.out.println(c1.add(10, 2));

	    c1.subPrint(10, 1); // 9 출력
	    System.out.println(c1.sub(10, 1));
	   
	   }
}
class Cal {
	int a;
	int b;
	
	public void addPrint(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	public void subPrint(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a-b);
	}
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}


