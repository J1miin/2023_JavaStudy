package Bpg430_OpenChallenge;

import java.util.Scanner;

public class WordQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WordVector wordVector = new WordVector();
		wordVector.addWord();
		wordVector.startQuiz(scanner);
		scanner.close();
	}

}
