package Bpg320_Q11;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b;
		String sOperator;
		System.out.println("두 정수와 연산자 입력하세요 ");
		a=scanner.nextInt();
		sOperator=scanner.next();
		b=scanner.nextInt();
		if (sOperator.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		}else if (sOperator.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}else if (sOperator.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}else if (sOperator.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}else {
			System.out.println("오류입니다.");
		}
		scanner.close();
	}

}
