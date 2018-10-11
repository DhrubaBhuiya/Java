package Polymorphism;
public class Square extends Rectangle{
	protected double side;
	
	public Square(){
		super();
		width=0.0;
		length=0.0;
	}

	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color, filled);
		this.side = side;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square[side="+side+",color="+color+",filled="+filled+"]";
	}
}
