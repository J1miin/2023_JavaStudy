package conditionalStmt;

import java.util.Scanner;

/*첫째 줄에는 현재 시각이 나온다. 
 * 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 
 * 순서대로 주어진다. 
 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.*/
public class Q_2525_OvenClock {
	public static void main(String[] args) {
		int iHour, iMin, cookTime;
		int cookMod; //cookTime을 60으로 나눈 나머지
		int cookMok; //cookTime을 60으로 나눈 몫
		
		Scanner scanner = new Scanner(System.in);
		iHour=scanner.nextInt();
		iMin=scanner.nextInt();
		cookTime=scanner.nextInt();
		
		cookMok = cookTime / 60;
		cookMod = cookTime % 60;
		
		if (cookMod==0) {
			iHour=iHour+cookMok;
			if (iHour >23) {
				iHour=iHour-24;
				System.out.print(iHour +" "+ iMin);
			}else {
				System.out.print(iHour +" "+ iMin);
			}
		}else {
			iMin=iMin+cookTime;
			if(iMin >=60) {
				cookMok=iMin/60;
				iHour=iHour+cookMok;
				iMin=iMin-(60*cookMok);
				if (iHour >23) {
					iHour=iHour-24;
					System.out.print(iHour +" "+ iMin);
				}else {
					System.out.print(iHour +" "+ iMin);
				}
			}else {
				iHour=iHour+cookMok;
				if (iHour >23) {
					iHour=iHour-24;
					System.out.print(iHour +" "+ iMin);
				}else {
					System.out.print(iHour +" "+ iMin);
				}
			}
		}
		scanner.close();
	}

}
