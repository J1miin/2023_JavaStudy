import java.util.Scanner;

public class Book_pg110_Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum1, inputNum2, inputNum3;
		System.out.print("정수 3개 입력하세요>>");
		inputNum1=scanner.nextInt();
		inputNum2=scanner.nextInt();
		inputNum3=scanner.nextInt();
		int mid;
		if (inputNum1>inputNum2) {
			if(inputNum2>inputNum3) {
				mid = inputNum2;
			}else {
				mid = inputNum3;
			}
		}else {//1<2
			if(inputNum1>inputNum3) {
				mid=inputNum1;
			}else {
				mid=inputNum3;
			}
		}
		
		System.out.print("중간값은 :"+mid);
		
		
		scanner.close();

	}

}
