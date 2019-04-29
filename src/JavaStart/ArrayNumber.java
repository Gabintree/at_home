package JavaStart;
public class ArrayNumber {
	public static void main(String[] args) {
		
		int i = 0;
	
		int[] ar = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
			
		for(i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println(" ");
		System.out.print("짝수 출력 : ");
		for(i = 0; i < ar.length; i++) {
			if(ar[i] % 2 == 0) {
			System.out.printf("%d ", ar[i]);
			}
		}
		System.out.println(" ");
		System.out.print("3의 배수 출력 : ");
		for(i = 0; i < ar.length; i++) {
			if(ar[i] % 3 == 0) {
			System.out.printf("%d ", ar[i]);
			}
		}
	}
}

/*
22. 임의의 숫자들이 들어있는 배열의 숫자 데이터들 중 
짝수인 요소만 골라서 출력하고 3의 배수인 요소만 골라서 출력하는 프로그램을 구현한다. 
배열을 구성하는 임의의 숫자 = 4 7 9 1 3 2 5 6 8
실행 예)
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
 9 3 6
*/
