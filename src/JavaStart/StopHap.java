package JavaStart;
import java.util.Scanner;
public class StopHap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int i = 1;
		while(true) {
			System.out.print(i + "��° �����Է� (-1 ����) : ");
			num = sc.nextInt();
			sum += num;
			i++;
			if(num == -1) {
				System.out.println("���ݱ��� �Էµ� ������ �� : " + (sum+1));
				break;
			}
		}
	}
}

/*
20. ����ڷκ��� ���� ���� ������ �Է¹޾� �� ���� ����Ͽ� ����� ������ִ� ���α׷��� �����Ѵ�. 
��, ����ڰ� [-1]�� �Է� �� �Է¹޴� ������ �����ϰ� �� ���� �Է¹޾Ƶ� �������� ���� ����� �� �ֵ��� �����Ѵ�.
���� ��)
1��° ���� �Է�(-1 ����) : 10
2��° ���� �Է�(-1 ����) : 10
3��° ���� �Է�(-1 ����) : 5
4��° ���� �Է�(-1 ����) : 8
5��° ���� �Է�(-1 ����) : 9
6��° ���� �Է�(-1 ����) : -1
������� �Էµ� ������ �� : 42
*/

