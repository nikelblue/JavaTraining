package org.training.warmup.sprint9;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ListsUtilTest {
	

	@Test
	public void test_reverseList1_NormalFlow() {
		List<String> initial = Arrays.asList("A", "B", "C");
		List<String> expected = Arrays.asList("C", "B", "A");
		List<String> actual = ListsUtil.reverseList1(initial);
		Assert.assertEquals("List not correctly reversed!", expected, actual);
	}
	
	@Test
	public void test_reverseList2_NormalFlow() {
		List<String> initial = Arrays.asList("X","Y","Z");
		List<String> expected = Arrays.asList("Z","Y","X");
		List<String> actual = ListsUtil.reverseList2(initial);
		Assert.assertEquals("List not correctly reversed!", expected, actual);
	}
	
	@Test
	public void test_commonPolygonsCorners_NormalFlow() {
		Point3D p1 = new Point3D(1,1,1);
		Point3D p2 = new Point3D(1,2,2);
		Point3D p3 = new Point3D(3,1,3);
		Point3D p4 = new Point3D(3,2,4);
		Point3D p5 = new Point3D(4,1,5);
		Point3D p6 = new Point3D(1,2,2);
		Point3D p7 = new Point3D(3,2,4);
		Point3D p8 = new Point3D(3,4,6);
		
		List<Point3D> polygon1 = Arrays.asList(p1,p2,p3,p4);
		List<Point3D> polygon2 = Arrays.asList(p5,p6,p7,p8);

		List<Point3D> expected = Arrays.asList(p2, p7);
		List<Point3D> actual = ListsUtil.commonPolygonsCorners1(polygon1, polygon2);
		
		Assert.assertEquals("Common polygons corners are not correct!", expected, actual);
	}

}
