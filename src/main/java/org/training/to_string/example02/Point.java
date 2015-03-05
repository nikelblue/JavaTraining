package org.training.to_string.example02;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/**
	 * Here is the magic. We override the method {@link Object#toString()} and return
	 * whatever string we like. In our case the string will look like: "[x,y]".
	 * 
	 * @see	http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
