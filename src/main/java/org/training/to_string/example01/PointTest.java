package org.training.to_string.example01;

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

		//Hmm... So ugly value for 'point'. Why it doesnt'show
		//something more readable?
		System.out.println("Point: " + point);

		//Let's proceed with the next example to see why.
	}
}
