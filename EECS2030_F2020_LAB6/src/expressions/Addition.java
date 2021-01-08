package expressions;

public class Addition extends Expression{

	Addition(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	void evaluate() {
		// TODO Auto-generated method stub
		value = left + right;
	}
	
	@Override
	Object getValue() {
		return this.value;
	}
	
	
	
	
}
