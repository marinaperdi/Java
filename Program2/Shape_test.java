import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Shape_test {

	
	
		@Test
		void test_default_constructor() {
			// Verify that default constructor initializes center to (0,0) and color to an empty string
			Shape shape = new Shape();
			assertEquals(0, shape.distanceBetweenCenters(new Shape(new CS252Point(), "")));
			assertEquals("Center: (0, 0); Color: ", shape.toString());
		}

		
		
		@Test
		void test_parameterized_constructor() {
			// Verify that parameterized constructor sets center and color correctly
			 CS252Point center = new CS252Point(5, 5);
		     String color = "Red";
		     Shape shape = new Shape(center, color);
		     assertEquals("Center: (5, 5); Color: Red", shape.toString());
		}
		
		

		@Test
		void test_distanceBetweenCenters_horizontal() {
			// Verify distance calculation between two shapes horizontally aligned
			Shape shape1 = new Shape(new CS252Point(1, 10), "");
			Shape shape2 = new Shape(new CS252Point(5, 10), "");
			assertEquals(4.0, shape1.distanceBetweenCenters(shape2), 0.00005);
			assertEquals(4.0, shape2.distanceBetweenCenters(shape1), 0.00005);
		}
		
		

		@Test
		void test_distanceBetweenCenters_diagonal() {
			// Verify distance calculation between two shapes diagonally aligned
			Shape shape1 = new Shape(new CS252Point(5, 10), "");
			Shape shape2 = new Shape(new CS252Point(10, 20), "");
			assertEquals(11.1803398875, shape1.distanceBetweenCenters(shape2), 0.00005);
			assertEquals(11.1803398875, shape2.distanceBetweenCenters(shape1), 0.00005);
		}
		
		

		@Test
		void test_toString() {
			// Verify toString method returns the correct string representation
			CS252Point center = new CS252Point(5, 5);
			String color = "Red";
			Shape shape = new Shape(center, color);
			assertEquals("Center: (5, 5); Color: Red", shape.toString());
		}
}
