package expressions;

public class AddAll extends ExpressionCollector {

	@Override
	void evaluate() {
		int res = 0;
		for (Expression exp : this.expressions) {
			exp.evaluate();
			res += (int) exp.value;
		}
		
		this.value = res;
	}

	@Override
	Object getValue() {
		return this.value;
	}

}
