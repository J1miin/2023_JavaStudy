import java.util.Scanner;

public class Book_pg110_Q2 {
	public static void main (String[] args) {
		int inputNum;
		int onePlace, tensPlace;
		Scanner scanner = new Scanner(System.in);

		System.out.print("2자리수 정수 입력(10-99):");
		inputNum=scanner.nextInt();
		if (inputNum>=10 && inputNum<=99) {
			onePlace=inputNum%10;
			tensPlace=inputNum/10;
			
			if (onePlace==tensPlace) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같다.");
			}else {
				System.out.println("No! 10의 자리와 1의 자리가 다르다.");
			}
		}else {
			System.out.println("범위 내의 숫자를 입력하시오 ");
		}
		
		
		scanner.close();
	}
}
