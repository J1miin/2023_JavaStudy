
public class Bpg166_Q10 {

	public static void main(String[] args) {
		final int ROW =4; 
		final int COL = 4;
		int iArray[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		//4*4 이차원 배열 생성 & 초기
		
		int iRandomNum; //중복 상관 없음. 이차원 배열에 들어갈 
		int iRandomRow; //임의의 이차원 배열위치 생성 -> 중복되지 않음  
		int iRandomCol; //임의의 이차원 배열위치 생성 -> 중복되지 않음  
		int iCnt;
		
		iCnt = 0;
		
		//겹치지 않는 10개의 임의의 자리 만들기
		while (true) {
			if (iCnt==10) {
				break;
			}
			iRandomRow = (int)(Math.random()*4);
			iRandomCol = (int)(Math.random()*4);
			iRandomNum = (int)(Math.random()*10+1); //1-10까지 랜덤 숫자 추출 
			if(iArray[iRandomRow][iRandomCol]==0) {
				iArray[iRandomRow][iRandomCol]=iRandomNum;
				iCnt=iCnt+1;
			}
		}
		//출력하기 
		
		for(int i=0 ;i<ROW;++i) {
			for (int j=0;j<COL;++j) {
				System.out.printf("%2d ",iArray[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
