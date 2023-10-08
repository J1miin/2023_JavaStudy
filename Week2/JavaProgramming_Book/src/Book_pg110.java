import java.util.Scanner;

public class Book_pg110 {

	public static void main(String[] args) {
		double iWon;
		double iRes;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요 (단위 원) >>");
		iWon = scanner.nextDouble();
		iRes=iWon/1100;
		System.out.printf("%.0f원은 $%.1f", iWon, iRes);
		//자바에 lf는 없다고 한다.
		scanner.close();

	}

}
