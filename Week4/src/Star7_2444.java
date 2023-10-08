import java.util.Scanner;

public class Star7_2444 {

	public static void main(String[] args) {
		int iSpace, iStar;
		int iInput, iLine;
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하시오: ");
		iInput=scanner.nextInt();
		
		//정방향 삼각형  
		for (int i=0;i<iInput;++i) {
			iSpace=iInput-i-1;
			for (int j=0;j<iSpace;++j) {
				System.out.print(" ");
			}
			iStar=2*i+1;
			for(int k=0;k<iStar;++k) {
				System.out.print("*");
			}
			System.out.println();
		}
		//역방향 삼각형
		iLine=iInput-1; //4
		for (int i=0;i<iLine;++i) {
			iSpace=i+1;
			for(int k=0;k<iSpace;++k) {
				System.out.print(" ");
			}
			iStar=(2*(iLine-i))-1;
			for (int j=0;j<iStar;++j) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
