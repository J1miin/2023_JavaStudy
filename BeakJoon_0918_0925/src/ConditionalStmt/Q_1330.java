package ConditionalStmt;

import java.util.Scanner;

public class Q_1330 {

	public static void main(String[] args) {
		int A,B;
		char big, small, same;
		big = '>';
		small='<';
		same='=';
		
		Scanner scanner = new Scanner(System.in);
		A=scanner.nextInt();
		B=scanner.nextInt();
		if (A>B) {
			System.out.println(big);
		}else if (A<B) {
			System.out.println(small);
		}else {
			System.out.println(same);
		}
	
		scanner.close();

	}

}
