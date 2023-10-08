import java.util.Scanner;

public class Q_2480_DiceGame {

	public static void main(String[] args) {
		int iInput1, iInput2, iInput3;
		int iMill, iThous, iHund, iPrice;
		iMill = 10000;
		iThous=1000;
		iHund=100;
		
		Scanner scanner = new Scanner(System.in);
		iInput1=scanner.nextInt();
		iInput2=scanner.nextInt();
		iInput3=scanner.nextInt();
		
		if (iInput1==iInput2 && iInput1==iInput3) {
			iPrice = iMill + iInput1*iThous;
		}else if (iInput1==iInput2 && iInput1!=iInput3) {
			iPrice = iInput1*iHund + iThous;
		}else if (iInput1==iInput3 && iInput1!=iInput2) {
			iPrice = iInput1*iHund + iThous;
		}else if (iInput2==iInput3 && iInput1!=iInput3) {
			iPrice = iInput2*iHund + iThous;
		}else {
			if (iInput1>iInput2) {
				if (iInput1>iInput3) {
					iPrice = iInput1*iHund;
				}else {
					iPrice = iInput3*iHund;
				}
			}else {
				if (iInput2>iInput3) {
					iPrice = iInput2*iHund;
				}else {
					iPrice = iInput3*iHund;
				}
			}
		}
		
		System.out.println(iPrice);
		scanner.close();

	}

}
