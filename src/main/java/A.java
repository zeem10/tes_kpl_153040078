//import java.beans.Expression;

public class A {
	public double hitung(double a, double b, double c) {
		Argument argA = new Argument("a", a);
		Argument argB = new Argument("b", b);
		Argument argC = new Argument("c", c);
		Expression exp = new Expression("(a+b)*c", argB, argA, argC);
		return exp.calculate();
//		return (a+b)*c;	
	}
}
