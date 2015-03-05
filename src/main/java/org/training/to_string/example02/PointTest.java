package org.training.to_string.example02;

/**
 * @author nikelblue
 *
 */
public class PointTest {
	public static void main(String[] args) {
		String str = "An Image is composed of points. Here is a point";
		Point point = new Point(1, 2);

		//This will show expected value for 'str'
		System.out.println("String: " + str);

		//Wow... Magically we can see a nice output for 'point'
		System.out.println("Point: " + point);
	}
}
