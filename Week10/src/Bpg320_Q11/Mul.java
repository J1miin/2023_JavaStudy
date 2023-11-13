package Bpg320_Q11;

public class Mul extends Calc {

	@Override
	int calculate() {
		int result=1;
		result=a*b;
		return result;
	}

	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;

	}

}
