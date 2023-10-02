import java.util.Scanner;

public class Bpg166_Q8 {

	public static void main(String[] args) {
		int iArraySize, i, iCnt;
		int iRandomNum;
		int iRow, iCol;
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 사이즈를 입력하세요:");
		iArraySize=scanner.nextInt();
		
		//int[] iArray; //선언은 아래나 위나 동일한 듯!
		int iArray[];//배열 선언 
		iArray = new int[iArraySize]; //배열 생성 
		iCnt=0;
		
		//이미  3 4 가 있다고 가정하고, 나는 5라는 숫자를 넣으려고 한다고 가정해보자.
		while (iCnt < iArraySize) {
			iRandomNum = (int)(Math.random()*100+1); //1-100까지 랜덤 숫자 추출 
			for (i=0;i<iCnt;++i) {
				if (iArray[i]==iRandomNum) {
					System.out.println("중복되는 숫자입니다.");
					break;
				}
			}
			if (i==iCnt) {
				iArray[iCnt]=iRandomNum;
				iCnt++;
			}else {
				iRandomNum = (int)(Math.random()*100+1); //1-100까지 랜덤 숫자 다시 추출 
			}
			
		}
		//출력 
		iRow = iArraySize/10;
		iCol = 10; 
		for (int j=0; j<iArraySize;++j) {
			System.out.print(iArray[j]+" ");
		}
		scanner.close();

	}

}
