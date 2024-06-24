package rectangle_java;

public class Rectangular {
	public int length;
	public int width;

	public Rectangular(int length, int width) {
		this.length = length;
		this.width = width;

	}

	public int getArea() {
		return length * length;
	}

	public int getParameter() {
		return 2 * (length + width);

	}
}
