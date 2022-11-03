package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double height;
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double findArea() {
		return this.length*this.height;
		
	}
	public double perimeter() {
		return (this.length*2.0)+(this.height*2.0);
	}
	public boolean isSmaller(Rectangle x) {
		return this.findArea() < x.findArea();
	}
	public boolean isSquare() {
		return this.length == this.height;
	}
	public void draw(double x, double y) {
		StdDraw.filledRectangle(x, y, this.length/2, this.height/2);
		
	}
}