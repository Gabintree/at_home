package JavaStart;

import java.util.Scanner;

public class ASC {

	public static void main(String[] args) {
	
		int[] arr = new int[3];	
		int tmp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력 하세요");
		arr[0] = sc.nextInt();
		System.out.println("두 번째 정수를 입력 하세요");
		arr[1] = sc.nextInt();
		System.out.println("세 번째 정수를 입력 하세요");
		arr[2] = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
		System.out.println("오름차순으로 출력");
		for(int i = 0; i < 3;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}



/*
9. 사용자로부터 임의의 정수를 입력받아 작은 수에서 큰 수 순으로 출력하는 프로그램을 작성한다.
실행 예)
첫 번째 정수 입력 : 16
두 번째 정수 입력 : 8
세 번째 정수 입력 : 21
졍렬 결과 :  8 16 21

*/