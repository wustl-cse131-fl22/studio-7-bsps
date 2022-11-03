package studio7;

public class Die {
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return this.sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int rollDie() {
		return (int)((Math.random()*this.sides)+1);
	}
}
