package expressions;

public class DisjoinAll extends ExpressionCollector {

	@Override
	void evaluate() {
		boolean res = false;
		
		for (Expression ex : this.expressions) {
			ex.evaluate();
			res |= (boolean) ex.value;
		}
		this.value = res;
	}

}
