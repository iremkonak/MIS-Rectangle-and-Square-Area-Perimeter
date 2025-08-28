package pack1;

public class Square extends Shape implements IShape,IShapePerimeter {

	@Override
	public int getArea() {
		a = getInt();
		return a*a;
	}

	@Override
	public int getPerimeter() {
		a = getInt();
		return a+a+a+a;
	}

	@Override
	public void displayArea() {
		System.out.println("Square Area: " +this.getArea());
		
	}

	@Override
	public void displayPerimeter() {
	   System.out.println("Square Perimeter "+this.getPerimeter());
		
	}

	
	
	
	
	
	
	
	
	
	
}
