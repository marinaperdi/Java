import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Point_test {

	
	
	
	@Test
	void test_constructors_1() {
		// 0-Parameter 
		CS252Point p1 = new CS252Point();
		assertEquals(0,p1.getX());
		assertEquals(0,p1.getY());
	}
	
	
	
	@Test
	void test_constructors_2() {
		// 2-Parameter
		CS252Point p2 = new CS252Point(420,-110);
		assertEquals(420,p2.getX());
		assertEquals(-110,p2.getY());
	}
	

	
	@Test
	void test_mutators() {
		CS252Point p1 = new CS252Point();
		p1.setX(39);
		p1.setY(-12);
		assertEquals(39,p1.getX());
		assertEquals(-12,p1.getY());
		
		CS252Point p2 = new CS252Point(420,-110);
		p2.setX(-39);
		p2.setY(12);
		assertEquals(-39,p2.getX());
		assertEquals(12,p2.getY());
	}
	
	
	
	@Test	
	void test_distance_1() {
		// Horizontal
		CS252Point p1 = new CS252Point(1,10);
		CS252Point p2 = new CS252Point(5,10);
		assertEquals(4.0,p2.distanceBetween(p1), 0.00005);
		assertEquals(4.0,p1.distanceBetween(p2), 0.00005);
	}
	
	
	
	
	void test_distance_2() {
		// Vertical, make sure to cross axes
		CS252Point p1 = new CS252Point(-1,10);
		CS252Point p2 = new CS252Point(-1,-10);
		assertEquals(20.0,p2.distanceBetween(p1), 0.00005);
		assertEquals(20.0,p1.distanceBetween(p2), 0.00005);
	}
	
	
	
	
	@Test
	void test_distance_3() {
		// Diagonal
		CS252Point p2 = new CS252Point(5,10);
		CS252Point p3 = new CS252Point(10,20);	
		assertEquals(11.1803398875,p2.distanceBetween(p3), 0.00005);
		assertEquals(11.1803398875,p3.distanceBetween(p2), 0.00005);
		
		p2.setX(-5);
		p2.setY(-10);
		CS252Point p1 = new CS252Point(-3,-2);
		assertEquals(8.246211,p2.distanceBetween(p1), 0.00005);
		assertEquals(8.246211,p1.distanceBetween(p2), 0.00005);		
	}
	
	
	
	
	@Test
	void test_toString() {
		CS252Point p1 = new CS252Point();
		assertEquals("(x=0,y=0)",p1.toString());
		
		CS252Point p2 = new CS252Point(420,-110);
		assertEquals("(x=420,y=-110)",p2.toString());
	}
	
	
}
