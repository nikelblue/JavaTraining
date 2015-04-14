package org.training.equals.example02;

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
	 * Here is the magic. We override the default implementation of {@link Object#equals(Object)}.
	 * We can specify our own rule for two objects to be considered equals,
	 * BUT NEVER BREAK THE CONTRACT FROM {@link Object#equals(Object)}: this
	 * operation must be: reflexive, symmetric and so on.
	 * 
	 * @see Object#equals(Object)
	 * @see http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals%28java.lang.Object%29
	 */
	@Override
	public boolean equals(Object obj) {
		//Contract:  for any non-null reference values x and y, this method 
		//returns true if and only if x and y refer to the same object 
		//(x == y has the value true).
		if( this == obj )
			return true;
		
		//For the moment we trust the caller that the given object is another Point
		//After all, what's the point to compare a point with something else :)) 
		Point other = (Point) obj;
		return 
				this.x == other.x && 
				this.y == other.y;
	}

}
