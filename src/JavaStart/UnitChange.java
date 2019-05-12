package JavaStart;
import java.util.Scanner;
public class UnitChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) { 
			String input;
					
			System.out.println("단위 변환 유형을 확인하여 해당 숫자를 입력하세요. ① inchi → cm ② cm → inchi ③ ㎡ → 평 ④ kg → pound ");
			int num = sc.nextInt();
		
			if(num == 1 || num == 2 || num == 3 || num == 4) {
	         } else {
	            continue;
	         }
					while(true) {
						System.out.println("변환할 정수를 입력하세요. [처음으로 이동 : Q 또는 0]");
						input = sc.next();
				
						ChangeOp chop = new ChangeOp(input);
					
							if(input.equals("Q") || input.equals("0")) {
								break;
							}
								if(num == 1) {
									chop.ic();
								}else if(num == 2) {
									chop.ci();
								}else if(num == 3) {
									chop.meter();
								}else if(num == 4) {
									chop.kp();
								}
					}
				}
	}
}

class ChangeOp {
		
	double output = 0;
	String input;
		
	public ChangeOp(String input) {
		this.input = input;
	}

	public void ic() {
		output = Integer.parseInt(input) * 2.54;
		System.out.println(output);
	}
	public void ci() {
		output = Integer.parseInt(input) * 0.393701;
		System.out.println(output);
	}
	public void meter() {
		output = Integer.parseInt(input) * 0.3025;
		System.out.println(output);
	}
	public void kp() {
		output = Integer.parseInt(input) * 2.204623;
		System.out.println(output);
	}
}




/*
단위변환 
① inchi -> cm
② cm -> inchi
③ ㎡ -> 평
④ kg -> pound

- 유형 선택 후 값을 바꿔가며 변환 가능하도록 반복 실행
- Q 혹은 0 입력시 초기 선택화면으로 이동

*/
