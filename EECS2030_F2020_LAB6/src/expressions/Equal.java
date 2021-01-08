package expressions;

public class Equal extends Expression {

	Equal(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void evaluate() {
		value = (left == right);
	}

	@Override
	Object getValue() {
		return this.value;
	}
}
