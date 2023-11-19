
public interface Shape {
	final double PI = 3.14;//상수 
	public abstract void draw();
	public abstract double getArea();
	public default void redraw() {
		System.out.print("--다시 그립니다.");
		draw();
	}
	//public은 생략 가능 
}
