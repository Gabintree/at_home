package JavaStart;
import java.util.Scanner;

public class UnitChangeDW {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while(true) { 
         String input;
               
         System.out.println("���� ��ȯ ������ Ȯ���Ͽ� �ش� ���ڸ� �Է��ϼ���. �� inchi �� cm �� cm �� inchi �� �� �� �� �� kg �� pound ");
         int num = sc.nextInt();
         
         if(num == 1 || num == 2 || num == 3 || num == 4) {
         } else {
            continue;
         }
         
         while(true) {
            
            System.out.println("��ȯ�� ������ �Է��ϼ���. [ó������ �̵� : Q �Ǵ� 0]");
            input = sc.next();
            
            
            ChangeOp1 chop = new ChangeOp1(input);
         
      
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

class ChangeOp1 {
      
   double output = 0;
   String input;
      
   public ChangeOp1(String input) {
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