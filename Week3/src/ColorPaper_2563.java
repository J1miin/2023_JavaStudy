import java.util.Scanner;

public class ColorPaper_2563 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int iPaperNum, iSum; 
		int pos_X, pos_Y;
		iSum=0;
		int iArray[][] = new int [100][100];
		//이차원 배열 0으로 초기화하기 
		for (int i=0;i<100;++i) {
			for (int j=0;j<100;++j) {
				iArray[i][j]=0;
			}
		}
		
		iPaperNum=scanner.nextInt(); //색종이 수 입력받기
		
		for(int m=0;m<iPaperNum;++m) {
			System.out.println("input");
			pos_X=scanner.nextInt();
			pos_Y=scanner.nextInt();
			for (int k=pos_X;k<pos_X+10;++k) {
				for (int q=pos_Y;q<pos_Y+10;++q) {
					if(iArray[k][q]==0) {
						iArray[k][q]=1; 
					}
				}
			}
		}
		//넓이 더하기 
		for (int z=0;z<100;++z) {
			for (int x=0;x<100;++x) {
				iSum=iSum+iArray[z][x];
			}
		}
		//출력
		System.out.println(iSum);
		scanner.close();

	}

}
