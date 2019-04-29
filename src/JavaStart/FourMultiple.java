package JavaStart;

public class FourMultiple {

	public static void main(String[] args) {
	
		int i;
			
		for(i = 1; i <= 100; i++) {
			
			if(i % 4 == 0) {
				System.out.printf("%d  ", i, '\t');
			}
			if(i % 20 == 0) {
				System.out.println();
			}
		}
	}
}

/*
21. 1부터 100까지의 수 중에서 4의 배수만 출력하는 프로그램을 구현한다. 
단, 한 줄에 5개씩 출력할 수 있도록 한다.
실행 예)
4    8    12    16    20
24   28    32    36    40
44   48    52    56    60
64   68    72    76    80
84   88    92    96    100
            :
*/


/*		int j = 0; // 5개씩 세는 변수
		for(int i = 1; i <= 100; i++) {
			
			if(i % 4 == 0) {
				j++;
				System.out.printf("%d ", i ,'\t');
			}
			if(j == 5) {
				System.out.println();
				j = 0;
			}
		}
	}
}
*/ //동운씨 작품
