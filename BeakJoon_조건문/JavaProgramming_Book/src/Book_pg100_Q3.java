import java.util.Scanner;

public class Book_pg100_Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputMoney, i_50000,i_10000, i_1000,i_100,i_50,i_10,i_1;

		System.out.print("금액을 입력하십시오 >>");
		
		inputMoney = scanner.nextInt();
		i_50000=inputMoney/50000;
		inputMoney=inputMoney%50000;
		
		i_10000=inputMoney/10000;
		inputMoney=inputMoney%10000;
		
		i_1000=inputMoney/1000;
		inputMoney=inputMoney%1000;
		
		i_100=inputMoney/100;
		inputMoney=inputMoney%100;
		
		i_50=inputMoney/50;
		inputMoney=inputMoney%50;
		
		i_10=inputMoney/10;
		inputMoney=inputMoney%10;

		i_1=inputMoney;
		
		System.out.println("오만원권 : "+ i_50000);
		System.out.println("만원권 : "+ i_10000);
		System.out.println("천원권 : "+ i_1000);
		System.out.println("백원권 : "+ i_100);
		System.out.println("오십원권 : "+ i_50);
		System.out.println("십원권 : "+ i_10);
		System.out.println("일원권 : "+ i_1);
		scanner.close();
		

	}

}
