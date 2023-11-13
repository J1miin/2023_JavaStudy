package Bpg320_Q11;

public class Div extends Calc {

	@Override
	int calculate() {
		int result;
		result=this.a/this.b;
		return result;
	}

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b=b;
	}

}
