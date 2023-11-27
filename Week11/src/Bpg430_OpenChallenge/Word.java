package Bpg430_OpenChallenge;

public class Word {
	private String sKor;
	private String sEng;
	
	public Word(String sEng, String sKor) {
		this.sKor=sKor;
		this.sEng=sEng;
	}
	
	public String getKor() {
		return sKor;
	}
	public String getEng() {
		return sEng;
	}
}
