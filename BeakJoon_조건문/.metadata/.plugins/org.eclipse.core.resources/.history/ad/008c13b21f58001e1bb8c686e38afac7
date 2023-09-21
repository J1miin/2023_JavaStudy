package conditionalStmt;
//윤년 문
import java.util.Scanner;

public class Q_2753 {

	public static void main(String[] args) {
		int iInputYear;
		int mod4,mod100,mod400;
		
		Scanner scanner = new Scanner(System.in);
		iInputYear=scanner.nextInt();
		
		mod4=iInputYear%4;
		mod100=iInputYear%100;
		mod400=iInputYear%400; 
		
		if (mod4==0 && (mod100!=0 || mod400 ==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		scanner.close();
		
	}

}
