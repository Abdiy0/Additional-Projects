package expressions;

public class LessThan extends Expression {

	LessThan(int left, int right) {
		super(left, right);
	}

	@Override
	void evaluate() {
		value = (left < right);
	}

	@Override
	Object getValue() {
		return this.value;
	}

}
