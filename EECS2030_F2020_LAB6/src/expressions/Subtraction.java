package expressions;

public class Subtraction extends Expression{

	Subtraction(int left, int right) {
		super(left, right);		
	}
	
	@Override
	void evaluate() {
		value = left - right;
	}

	@Override
	Object getValue() {
		
		return this.value;
	}
}

	
	
	

