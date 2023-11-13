package Bpg320_Q11;

public class Add extends Calc {

	@Override
	int calculate() {
		int sum=0;
		sum=a+b;
		return sum;
	}

	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}

}
