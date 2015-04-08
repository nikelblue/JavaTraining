package org.training.to_string.exercise01;

public class Point3D {
	private final int x;
	private final int y;
	private final int z;

	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	//TODO: override toString() method accordingly
	@Override
	public String toString() {
		return "[" + x + "," + y +"," + z + "]";
	}
}
