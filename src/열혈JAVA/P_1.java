package ¿­Ç÷JAVA;

public class P_1 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	
		int sum1=0;
		int total=0;
		for(int i=1; i<=10;i++) {
			sum1 += i;
			total += sum1;
		}
		System.out.println(total);
	
		int sum2 = 0;
		int s =1;
		int num = 0;
		
		for(int i= 1; true; i++,s=-s) {
			num = s*i;    //+1, -1¹Ù²ãÁÖ´Â º¯¼ö
			sum2+= num;
			
			if(sum2>=100)
				break;
		}
		System.out.println(num);
		System.out.println(sum2);
		
		
		for(int m=0; m<=10; m++) {
			for(int j=0;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
		String a ="Information";
		System.out.printf("%-10.4s\n", a);
		System.out.printf("%10.4s\n", a);
		
		
	}
}
