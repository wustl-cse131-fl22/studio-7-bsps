package studio7;

import java.awt.Color;

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
}
