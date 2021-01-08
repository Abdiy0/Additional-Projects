package expressions;

public class TimesAll extends ExpressionCollector {

	@Override
	void evaluate() {
		int res = 1;
		for (Expression ex : this.expressions) {
			ex.evaluate();
			res *= (int) ex.value;
		}
		this.value = res;
	}

}
