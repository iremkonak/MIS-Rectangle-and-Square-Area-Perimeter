package pack1;

public class Rectangle extends Shape{

	@Override
	public int getArea() {
		a = getInt();
		b = getInt();
		return a*b;
	}

	@Override
	public int getPerimeter() {
		a = getInt();
		b = getInt();
		return a+a+b+b;
	}
	

}
