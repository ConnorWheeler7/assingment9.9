package assignment_nine_nine;

class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}

	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public double getSide() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getPerimeter() {
		return (side * n);
	}

	public double getArea() {
		return (side * side * n) / (4 * Math.tan(Math.PI / n));
	}
}

public class Exercise_09_09 {
	public static void main(String[] args) {
		RegularPolygon polygonArr[] = new RegularPolygon[3];
		polygonArr[0] = new RegularPolygon();
		polygonArr[1] = new RegularPolygon(6, 4);
		polygonArr[2] = new RegularPolygon(10, 4, 5.6, 7.8);
		for (int i = 0; i < polygonArr.length; i++) {
			System.out.println("Polygon " + (i + 1) + " perimeter: " + polygonArr[i].getPerimeter());
			System.out.println("Polygon " + (i + 1) + " area: " + polygonArr[i].getArea());
		}
	}
}