package pack1;

import javax.swing.JOptionPane;

public abstract class Shape {

	int a,b;
	
	public int getInt() {
		return Integer.parseInt(JOptionPane.showInputDialog("A number? "));
		
	}
	
	
	public abstract int getArea();
	public abstract int getPerimeter();
    
	
	
	
}
