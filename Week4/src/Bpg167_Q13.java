
public class Bpg167_Q13 {

	public static void main(String[] args) {
		//1자리 수 인지, 2자리 수 인지 점검
		int iNumber =99;
		int iMok, iMod;
		int iRes;
		
		for (int i=0;i<iNumber;++i) {
			iMod=(i+1)%10;
			iMok=(i+1)/10;
	
			if(iMok==0) {//1의 자리수라면
				if (iMod==3 || iMod==6 || iMod ==9) {
					System.out.println(iMod+" 박수 짝");
				}
			}else { //2자리 수 일 때
				//일의자리와 십의자리를 나눠서 판단 
				if (iMod==3 || iMod==6 || iMod ==9) {
					if (iMok==3 || iMok==6 || iMok ==9) {
						//iMok+iMod 로 출력했더니 둘이 합해진 결과가 나왔다. 그래서 iRes변수를 새로 잡았다.
						iRes=iMok*10+iMod;
						System.out.println(iRes+" 박수 짝짝");
					}else {
						iRes=iMok*10+iMod;
						System.out.println(iRes+" 박수 짝");
					}
				}else {
					if (iMok==3 || iMok==6 || iMok ==9) {
						iRes=iMok*10+iMod;
						System.out.println(iRes+ " 박수 짝");
					}
				}
			}
			
		}
		
	}

}
