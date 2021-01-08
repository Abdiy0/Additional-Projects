package expressions;

public class ConjoinAll extends ExpressionCollector {

	@Override
	void evaluate() {
		boolean res = true;
		
		for (Expression exp : this.expressions) {
			exp.evaluate();
			res &= (boolean) exp.value;
		}
		
		this.value = res;
	}
	
}
