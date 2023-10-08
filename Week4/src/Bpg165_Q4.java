import java.util.Scanner;

public class Bpg165_Q4 {

	public static void main(String[] args) {
		int aAsciiNum; //소문자 a의 아스키숫자 저장 
		int iInputCharNum; //입력한 문자의 아스키 숫자 저장 
		int iCol; //abcde > abcd > abc > ab > a 이렇게 출력하기 위해서 열에 변화를 주기 위한 변수
		char cInputChar;
		int k=1;
		
		aAsciiNum = 97;
		
		Scanner scanner = new Scanner (System.in);

		System.out.println("소문자 알파벳을 하나 입력하세요 :");
		cInputChar=scanner.next().charAt(0);
		iInputCharNum = (int)cInputChar+1;
		
		for (int j=aAsciiNum;j<iInputCharNum;++j) {
			iCol= iInputCharNum-k+1; //102 > 101 > 100> 99 > 99
			//iInputCharNum이 cInputChar+1 이라서 위와 같이 됨.
			
			for (int i=aAsciiNum;i<iCol;++i) {
				System.out.print((char)i+" ");
			}
			System.out.println();
			k++;
		}
		
		
		
		
		
		scanner.close();
		// TODO Auto-generated method stub

	}

}
