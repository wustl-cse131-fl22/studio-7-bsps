package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/**
	 * 
	 * @param the fraction we are multiplying by
	 * @return the new multiplied fraction
	 */
	public Fraction multiply(Fraction f) {
		int newNumerator = this.numerator * f.numerator;
		int newDenominator = this.denominator * f.denominator;
		Fraction frac = new Fraction(newNumerator, newDenominator);
		return frac;
	}
	public Fraction simplify() {
		int commonDenominator = gcd(this.numerator, this.denominator);
		int simplifyNumerator = this.numerator/commonDenominator;
		int simplifyDenominator = this.denominator/commonDenominator;
		Fraction frac = new Fraction(simplifyNumerator, simplifyDenominator);
		return frac;
	}
	private int gcd(int p, int q) {
		if (q == 0) {
			return p;
		}
		else {
			return gcd(q, p%q);
		}
	}
	public Fraction addition(Fraction f) {
		int num1 = this.numerator * f.denominator;
		int num2 = f.numerator * this.denominator;
		int den = this.denominator * f.denominator;
		int totalNum = num1+num2;
		Fraction frac = new Fraction(totalNum, den);
		Fraction adjustedFrac = frac.simplify();
		return adjustedFrac;
	}
}

