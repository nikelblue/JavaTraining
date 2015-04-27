package org.training.warmup.sprint9;
/**
 * @author monkey
 *
 */
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

	public boolean equals(Object obj) {
		if( this == obj )
			return true;
		
		if(!(obj instanceof Point3D))
			return false;
		
		Point3D other = (Point3D) obj;
		return 
				this.x == other.x && 
				this.y == other.y &&
				this.z == other.z;
	}
	
	public String toString() {
		return "(" + getX()+","+getY()+","+getZ() + ")";
	}
	
}
