package JavaStart;

import java.io.IOException;

public class Alphabet {

	public static void main(String[] args) throws IOException {
	
		int n;
		System.out.println("���ĺ� �� ���ڸ� �Է��� �ּ���.");
		n = System.in.read(); // �� ����Ʈ�� �о��, �ƽ�Ű�ڵ� ���� ��ȯ��.
		
		if((n==65 ||n==69 ||n==73 ||n==79 ||n==85) || //65 A,69 E, 73 I, 79 O, 85 U,  
		(n==97 ||n==101 ||n==105 ||n==111 ||n==127))  // 97 a, 101 e, 105 i, 111 o, 117 u,
		{
			System.out.println("���� OK ~!!!");
		}else if(n<=64 || n>123) 
		{	//64���� ���ڿ� ��ȣ��, 64���� �۰ų� ������ �Է¿��� OR 123���� ũ�� ���ĺ��� �ƴϹǷ� �Է¿���
			System.out.println("�Է� ����~!!!");
		}else {System.out.println("���� �Դϴ�.");
		}
	}
}

/*
10. ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾� �̸� �Ǻ��Ͽ� 
�Է¹��� ���ĺ��� ������ ��츸 ����� ����ϴ� ���α׷��� �ۼ��Ѵ�. 
��, ��ҹ��ڸ� ��� ������ �� �ֵ��� ó���Ѵ�. 
����, ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ��� �Է� ������ ���� ������ ����ڿ��� �ȳ����� �� �ֵ��� �Ѵ�.
���� ��)
���ĺ� �� ���� �Է� : A
���� ok~!!!
���ĺ� �� ���� �Է� : 1
�Է� ����~!!!
*/

/* class Alphabet{
	
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("���ĺ� �Է�");
	      char c = sc.next().charAt(0);
	      
	      int n = (int) c;
	      
	      if((n==65 || n==69 || n==73 || n==79 || n==85 || n==87) ||
	           ( n==97 || n==101 || n==111 || n==127 || n==129))
	      {
	         System.out.println("���� ������");
	      } else if (n <= 64 || n > 123) {
	         System.out.println("�Է� ����!!");
	      }  System.out.println("���ĺ�");
	      }
	   }
*/ //����� ���� �ҽ� �ڵ� 

	
	
	
