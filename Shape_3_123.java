import static java.lang.Math.*;

abstract class Shape{

	protected String color;
	protected boolean filled;

	Shape(){}

	Shape(String color, boolean filled){

		this.color=color;
		this.filled=filled;
	}

	public String getColor(){ 
	    return color; 
	}

	public void setColor(String color){ 
	    this.color=color; 
	}

	public boolean isFilled(){ 
	    return filled; 
	}

	public void setFilled(boolean filled){ 
	    this.filled=filled; 
	}

	abstract public double getArea();

	abstract public double getPerimeter();
}

class Rectangle extends Shape{

	protected double width;
	protected double length;
	
	Rectangle(){}

	Rectangle(double width, double length){

		this.width=width;
		this.length=length;
	}

	Rectangle(double width, double length, String color, boolean filled){

		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
	}

	public double getWidth(){ 
	    return width; 
	}
	
	public void setWidth(double width){ 
	    this.width=width; 
	}

	public double getLength(){ 
	    return length; 
	}

	public void setLength(){ 
	    this.length=length; 
	}

	public double getArea(){ 
	    return width*length; 
	}

	public double getPerimeter(){ 
	    return 2*(width+length); 
	}
}

class Square extends Rectangle{

	protected double side;

    Square(){}

	Square(double side){ 
	    this.side=side; 
	}

	Square(double side, String color, boolean filled){

		this.side=side;
		this.color=color;
		this.filled=filled;
	}

	public double getSide(){ 
	    return side; 
	}

	public void setSide(double side){ 
	    this.side=side; 
	}

	public void setWidth(double side){ 
	    width=side; 
	}

	public void setLength(double side){ 
	    length=side; 
	}	
}

class Circle extends Shape{

	protected double radius;

	Circle(){}

	Circle(double radius){ 
	    this.radius=radius; 
	}
	
	Circle(double radius, String color, boolean filled){

		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}

	public double getRadius(){ 
	    return radius; 
	}

	public void setRadius(double radius){ 
	    this.radius=radius; 
	}

	public double getArea(){ 
	    return PI*pow(radius,2); 
	} 

	public double getPerimeter(){ 
	    return 2*PI*radius; 
	}
}
