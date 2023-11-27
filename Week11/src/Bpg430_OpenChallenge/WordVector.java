package Bpg430_OpenChallenge;

import java.util.Scanner;
import java.util.Vector;

public class WordVector {
	private Vector<Word> wordVector;
	private int iAnswerRandomNum;
	private int indexOfAnswerRandomNum;
	private int quizArr[];
	
	public WordVector() {
		wordVector = new Vector<Word>();
	}
	
	public void addWord() { //사전에 단어 넣기 
		wordVector.add(new Word("love","사랑"));
		wordVector.add(new Word("apple","사과"));
		wordVector.add(new Word("human","사람"));
		wordVector.add(new Word("home","집"));
		wordVector.add(new Word("want","원하다"));
		wordVector.add(new Word("sleep","잠자다"));
		wordVector.add(new Word("puppy","강아지"));
		wordVector.add(new Word("phone","폰"));
		wordVector.add(new Word("cat","고양이"));
		wordVector.add(new Word("bear","곰"));
		wordVector.add(new Word("banana","바나나"));
	}
	
	public int vectorSize() {
		//벡터에 들어있는 단어의 개수 반환 
		return wordVector.size();
	}
	
	public void makeQuestion() {
		int vectorSize= vectorSize(); //벡터에 있는 단어의 개수 
		quizArr = new int[4]; //보기로 제공되는 4개의 한글 단어의 인덱스 숫자를 담는 배열
		int i=0;
		int iCnt =0;
		int iRandomNum;
		
		//중복되는 수 없이 4개 뽑기  
		while (iCnt<4) {
			iRandomNum = (int)((Math.random()*10000)%vectorSize);
			//벡터에 있는 단어숫자 범위 내에서 랜덤 숫자 추출해서 보기 배열(QuizArr)에 넣기   
			//Ex. quizNumArr[] = {1,9,4,2} 라면, 여기서 답이 될 인덱스를 랜덤으로 찾고,
			//여기의 인덱스 번호로 벡터에서 단어 찾기
			
			for (i=0;i<iCnt;++i) {
				if (quizArr[i]==iRandomNum) {
					//중복되므로 다시 만들어야 함. 
					break;
				}
			}
			if (i==iCnt) {
				quizArr[iCnt]=iRandomNum;
				iCnt++;
			}
		}
		
		
		iAnswerRandomNum = (int)((Math.random()*10000)%4); 
		//for문으로 찾은 랜덤 숫자 중에서 배열의 위치를 기준으로 정답이 될 숫자를 랜덤으로 뽑기 
		indexOfAnswerRandomNum = quizArr[iAnswerRandomNum];
	}
	
	public void startQuiz(Scanner scanner) {
		String showWord; //문제로 물어볼 때 나오는 단어
		String exampleWord;
		int inputAnswerNum;
		
		System.out.println("명품영어의 단어 테스트를 시작합니다. -1 입력 시 종료합니다.");
		System.out.println("현재"+ vectorSize()+"개의 단어가 들어있습니다.");
		
		
		
		while (true) {
			makeQuestion();
			showWord= wordVector.get(indexOfAnswerRandomNum).getEng();
			
			System.out.println(showWord+"?");
			for (int i=0;i<4;++i) {
				exampleWord = wordVector.get(quizArr[i]).getKor();
				System.out.print("("+(i+1)+")"+exampleWord+" ");
			}
			
			inputAnswerNum = scanner.nextInt();

			if (inputAnswerNum == -1 ){
				System.out.println("----------------");
				System.out.println("종료합니다. ");
				break;}
			
			inputAnswerNum -=1; //배열 인덱스는 하나 빼줘야 하기때문에 
			if(wordVector.get(quizArr[inputAnswerNum]).getEng().equals(showWord)) {
				System.out.println("good!");
				System.out.println("----------------");
			}else {
				System.out.println("no!");
				System.out.println("----------------");
			}
		}
	}
}
