package Bpg434_Q1;
import java.util.Scanner;

public class VectorRunner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		VectorPr vectorPr = new VectorPr();
		
		vectorPr.addNumtoVector(scanner);
		
		System.out.println("최대값은 : "+ vectorPr.maxNum());
		
		scanner.close();
	}


}
