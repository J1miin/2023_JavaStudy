package conditionalStmt;

import java.util.Scanner;

public class Q_14681_Quadrant {

	public static void main(String[] args) {
		int iInputX, iInputY;
		
		Scanner scanner = new Scanner(System.in);
		iInputX=scanner.nextInt();
		iInputY=scanner.nextInt();
		
		if(iInputX>0) {
			if (iInputY>0) {
				System.out.println("1");
			}else if (iInputY<0) {
				System.out.println("4");
			}
		}else if (iInputX<0) {
			if (iInputY>0) {
				System.out.println("2");
			}else if (iInputY<0) {
				System.out.println("3");
			}
		}
		
		scanner.close();

	}

}
