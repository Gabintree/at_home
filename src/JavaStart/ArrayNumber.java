package JavaStart;
public class ArrayNumber {
	public static void main(String[] args) {
		
		int i = 0;
	
		int[] ar = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
			
		for(i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println(" ");
		System.out.print("¦�� ��� : ");
		for(i = 0; i < ar.length; i++) {
			if(ar[i] % 2 == 0) {
			System.out.printf("%d ", ar[i]);
			}
		}
		System.out.println(" ");
		System.out.print("3�� ��� ��� : ");
		for(i = 0; i < ar.length; i++) {
			if(ar[i] % 3 == 0) {
			System.out.printf("%d ", ar[i]);
			}
		}
	}
}

/*
22. ������ ���ڵ��� ����ִ� �迭�� ���� �����͵� �� 
¦���� ��Ҹ� ��� ����ϰ� 3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ѵ�. 
�迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8
���� ��)
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
 9 3 6
*/
