public class Main{

	public static void main(String[] args){

		MovablePoint p = new MovablePoint(1,2,3,4);
		p.toString();
		p.moveUp();
		p.moveDown();
		p.moveRight();
		p.moveLeft();

		MovableCircle c = new MovableCircle(5,6,7,8);
		c.toString();
		c.moveUp();
		c.moveDown();
		c.moveRight();
		c.moveLeft();

		MovableCircle r = new MovableCircle(9,9,9,9,7,8);
		r.toString();
		r.moveUp();
		r.moveDown();
		r.moveRight();
		r.moveLeft();
	}
}

interface Movable{

	void moveUp();
	void moveDown();
	void moveRight();
	void moveLeft();
}

class MovablePoint implements Movable{

	public int x;
	public int y;
	public int xSpeed;
	public int ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed){

		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;

	}

	public String toString(){
	    
	    System.out.print("Точка:\n");
	    return "point";
	}

	public void moveUp(){

		if(y>0)
			System.out.printf("Точка движется наверх на %d со скоростью %d\n", y, ySpeed);
	}

	public void moveDown(){

		if(y<0)
			System.out.printf("Точка движется вниз на %d со скоростью %d\n", y, ySpeed);
	}

	public void moveRight(){

		if(x>0)
			System.out.printf("Точка движется направо на %d со скоростью %d\n", x, xSpeed);
	}

	public void moveLeft(){

		if(x<0)
			System.out.printf("Точка движется на %d со скоростью %d\n", x, xSpeed);
	}

}


class MovableCircle extends MovablePoint{ 
 
	private int radius; 
	private MovablePoint center = new MovablePoint(10,10,11,12); 

	MovableCircle(int x, int y, int xSpeed, int ySpeed){

		super(x,y,xSpeed,ySpeed);

		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;

	}

	public String toString(){
	    
	    System.out.print("Круг:\n");
	    return "circle";
	}

	public void moveUp(){

		if(y>0)
			System.out.printf("Круг движется наверх на %d со скоростью %d\n", y, ySpeed);
	}

	public void moveDown(){

		if(y<0)
			System.out.printf("Круг движется вниз на %d со скоростью %d\n", y, ySpeed);
	}

	public void moveRight(){

		if(x>0)
			System.out.printf("Круг движется направо на %d со скоростью %d\n", x, xSpeed);
	}

	public void moveLeft(){

		if(x<0)
			System.out.printf("Круг движется налево на %d со скоростью %d\n", x, xSpeed);
	}

}

class MovableRectangle extends MovablePoint{

	private MovablePoint topLeft = new MovablePoint(9,9,9,9);
	private MovablePoint bottomRight = new MovablePoint(9,9,9,9);

	MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){

	public String toString(){
	    
	    System.out.print("Прямоугольник:\n");
	    return "rectangle";
	}

	if(x1==x2 && y1==y2){

			this.x=x1;
			this.y=y1;
			this.xSpeed=xSpeed;
			this.ySpeed=ySpeed;

			super(x,y,xSpeed,ySpeed);


	public void moveUp(){

		if(y>0)
			System.out.printf("Прямоугольник движется наверх на %d со скоростью %d\n", y, ySpeed);
	}

	public void moveDown(){

		if(y<0)
			System.out.printf("Прямоугольник движется вниз на %d со скоростью %d\n", y, ySpeed);
	}

	public void moveRight(){

		if(x>0)
			System.out.printf("Прямоугольник движется направо на %d со скоростью %d\n", x, xSpeed);
	}

	public void moveLeft(){

		if(x<0)
			System.out.printf("Прямоугольник движется налево на %d со скоростью %d\n", x, xSpeed);
	}

		}

  }
} 
	
