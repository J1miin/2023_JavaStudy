package Bpg386_Q8;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString;
		System.out.print(">>");
		inputString = scanner.nextLine();
		
		RotatingString rotatingString = new RotatingString(inputString);
		rotatingString.stringRotate();
		scanner.close();
	}
	
}
