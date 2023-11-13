package Bpg320_Q11;

public class Sub extends Calc {

	@Override
	int calculate() {
		int result=0;
		if(a>b) {
			result=this.a-this.b;
		}else {
			result = this.b-this.a;
		}
		return result;
	}

	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;

	}

}
