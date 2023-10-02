import java.util.Scanner;

public class Bpg170_Q16 {

	public static void main(String[] args) {
		String sArray[] = {"가위","바위","보"}; //문자열 배열 선언과 동시에 초기화 
		int iRandomNum;
		
		String sInput; //문자열은 String 타입으로 선언해서 받아준다. 
		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보! >> ");
			sInput=scanner.nextLine(); //문자열은 .nextLine()으로 받는 것 같다.
			
			if (sInput.equals("가위")||sInput.equals("바위")||sInput.equals("보")) {
				iRandomNum =(int)Math.random()*3; //0-2까지 랜덤으로 뽑기
				
				//컴퓨터를 기준으로 경우 나누기
				if (sArray[iRandomNum].equals("가위")) {
					if (sInput.equals("가위")) {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 비겼습니다");
					}else if (sInput.equals("바위")) {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 사용자가 이겼습니다");
					}else {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 사용자가 졌습니다");
					}
				}else if (sArray[iRandomNum].equals("바위")) {
					if (sInput.equals("가위")) {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 사용자가 습니다");
					}else if (sInput.equals("바위")) {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 비겼습니다");
					}else {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 사용자가 이겼습니다");
					}
				}else { //컴퓨터는 보를 내는 경우
					if (sInput.equals("가위")) {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 사용자가 이겼습니다");
					}else if (sInput.equals("바위")) {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 사용자가 졌습니다");
					}else {
						System.out.println("사용자 = "+sInput+", 컴퓨터 = "+sArray[iRandomNum]+" 비겼습니다");
					}
				}
			}else if (sInput.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
				
			}
		}
		
		scanner.close();

	}

}
