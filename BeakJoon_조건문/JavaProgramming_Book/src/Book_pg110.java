import java.util.Scanner;

public class Book_pg110 {

	public static void main(String[] args) {
		double iWon;
		double iRes;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요 (단위 원) >>");
		iWon = scanner.nextInt();
		iRes=iWon/1100;
		System.out.println(iWon+"원은 $"+iRes);
		scanner.close();

	}

}
