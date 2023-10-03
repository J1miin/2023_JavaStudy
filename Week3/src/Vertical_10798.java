import java.util.Scanner;

public class Vertical_10798 {

    public static void main(String[] args) {
        final int ROW = 5;
        final int COL = 15;
        char sArray[][] = new char[ROW][COL]; // 2차원 배열 선언
        Scanner scanner = new Scanner(System.in);
        int i, j;
        System.out.println("입력하세요");
        for (i = 0; i < ROW; ++i) { // 2차원 배열에 값 입력받기
            //여기 잘 모르겠...
        }
        for (i = 0; i < COL; ++i) { // 2차원 배열을 세로로 출력
            for (j = 0; j < ROW; ++j) {
                System.out.print(sArray[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
