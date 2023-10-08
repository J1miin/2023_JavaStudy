import java.util.Scanner;

public class Book_pg100_Q5 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요 >>");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if (a>b && a>c) {
			if(a>b+c) {
				System.out.println("삼각형된다. ");
			}else {
				System.out.println("삼각형 된다. ");
			}
		}else if(b>c && b>a) {
			if(b>a+c) {
				System.out.println("삼각형된다. ");
			}else {
				System.out.println("삼각형 된다. ");
			}
		}else if(c>a && c>b) {
			if(c>a+b) {
				System.out.println("삼각형된다. ");
			}else {
				System.out.println("삼각형 된다. ");
			}
		}
		scanner.close();
	}

}
