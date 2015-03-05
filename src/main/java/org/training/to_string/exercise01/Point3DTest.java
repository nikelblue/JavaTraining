package org.training.to_string.exercise01;

/**
 * @author nikelblue
 *
 */
public class Point3DTest {
	public static void main(String[] args) {
		String str = "A 3D Image is composed of points, too. Here is a 3D point";
		Point3D point = new Point3D(7, 6, 5);

		//This will show expected value for 'str'
		System.out.println("String: " + str);

		//TODO: we expect the output: 
		//Point: [7,6,5]
		System.out.println("Point3D: " + point);
	}
}
