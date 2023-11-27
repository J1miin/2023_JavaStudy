package Bpg386_Q8;

public class RotatingString {
	private String inputString;
	
	public RotatingString(String inputString) {
		this.inputString=inputString;		
		//기본생성자 
	}
	
	public void stringRotate() {
		//회전하는 메서드
		int strLen, i, startIdx;
		char temp;
		String rotated;
		strLen = inputString.length(); //길이구하기
		rotated = inputString;
		
		for (i =0;i<strLen;++i) {
			startIdx=1; //계속 맨 앞 하나 추출하고1번 인덱스부터 substring 하니까 1로 고정 
			temp = rotated.charAt(0); //한글자씩 뒤로 보내기 위해 추출하기 
			rotated = rotated.substring(startIdx)+temp;
			System.out.println(rotated);			
		}
	}
}
