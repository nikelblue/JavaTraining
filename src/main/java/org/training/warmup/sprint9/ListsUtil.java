/**
 * 
 */
package org.training.warmup.sprint9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.training.generics.example02.Box;
import org.training.warmup.sprint9.Point3D;

/**
 * @author monkey
 *
 */
public class ListsUtil {

	/**
	 * 
	 * 	
	 * @param args
	 */

	public static void main(String[] args) {
		List<String> list = Arrays.asList("H","e","l","l","o"," ","M","o","n","k","e","y");
		System.out.print(reverseList1(list));
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		System.out.print(reverseList2(list2));
		
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

		List<Point3D> intersection = commonPolygonsCorners1(polygon1, polygon2);
		
		System.out.println("Polygon common cornors are: " + intersection);
	}

	public static <T> List<T> reverseList1(List<T> list) {
		List<T> revList = new ArrayList<T>();

		if(list==null){
			return null;
		}else if(list.isEmpty()){
			return revList;
		}else{

			for (T element : list) {
				revList.add(0,element);
			}		
		}
		return revList;
	}
	
	public static <T> List<T> reverseList2(List<T> list) {
		
		List<T> revList = new ArrayList<T>();
		
		for (Iterator<T> iterator = list.iterator(); iterator.hasNext();) {
			T n = iterator.next();
			revList.add(0,n);
		}
		
		return revList;
	}
	
	public static List<Point3D> commonPolygonsCorners(List<Point3D> polygon1, List<Point3D> polygon2) {
		List<Point3D> intersection = new ArrayList<Point3D>();
				
		for (Point3D t1 : polygon1) {
			for(Point3D t2 : polygon2) {
				if(t1.equals(t2)) {
					intersection.add(t1);					
				}
			}
		}	
		
		return intersection;
	}
	
	public static List<Point3D> commonPolygonsCorners1(List<Point3D> polygon1, List<Point3D> polygon2) {
		List<Point3D> intersection = new ArrayList<Point3D>(polygon1);
		intersection.retainAll(polygon2);
		return intersection;
	}
}

