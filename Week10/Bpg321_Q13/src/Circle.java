
public class Circle implements Shape {
	private int radius;
	//기본생성자 
	public Circle(int radius) {
		this.radius=radius; 
	}
	//draw메서드 구현 
	public void draw() {
		System.out.println("반지름이 "+this.radius+"인 원입니다.");
	}
	public double getArea() {
		double dArea;
		dArea = (double)radius * (double)radius * PI;
		return dArea;
	}
}
/*
 	public abstract void draw();
	public abstract double getArea();
	public default void redraw() {
		System.out.print("--다시 그립니다.--");
		draw();
	}
*/