import java.util.Scanner;

public class Bpg159_OpenChallenge {

	public static void main(String[] args) {
		int iRandomNum, iInput;
		int iStart, iEnd;
		int iCnt;
		
		iStart=0;
		iEnd=99;
		iCnt=1;
		
		Scanner scanner = new Scanner(System.in);
		
		iRandomNum= (int)(Math.random()*100); //0-99까지 숫자 랜덤 추출 
		System.out.println("수를 결정하였습니다. 맞추어보세요 : ");
		
		while(true) {
			System.out.println(iStart+"-"+iEnd);
			System.out.print(iCnt + " >> ");
			iInput=scanner.nextInt();
			
			if(iInput>iRandomNum) { //input 50이라면
				System.out.println("더 낮게");
				iEnd=iInput;
			}else if(iInput<iRandomNum) {//30이라
				System.out.println("더 높게");
				iStart=iInput;
			}else {
				//같다면
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까?y/n");
				String cAnswer=scanner.next();
				if(cAnswer.equals("y")) {
					iRandomNum= (int)(Math.random()*100);
					iCnt=1;
					iStart=0;
					iEnd=99;
					continue;
				}else {
					System.out.println("종료합니다.");
					break;
				}
			
			}
			iCnt++;
		}
		scanner.close();			
		
		
	}
}


