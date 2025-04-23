import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MPFindDistance {
	public static void main(String[] args) {
        // create two CS252Point objects, myp1 and myp2
        CS252Point myp1 = new CS252Point(888, 666);
        CS252Point myp2 = new CS252Point(405, -2);
        
        // print each point
        System.out.println("Point 1: " + myp1);
        System.out.println("Point 2: " + myp2);
        
        // print distance between them
        double distancePoints = myp1.distanceBetween(myp2);
        System.out.println("Distance between Point 1 and Point 2: " + distancePoints);
        
        // create and print a list of seven CS252Point objects
        ArrayList<CS252Point> pointList = createPointList(7);
        System.out.println("Point List: " + pointList);
        
        // Find and print the index of the point furthest from the origin
        int furthestIndex = findFurthestFromOrigin(pointList);
        System.out.println("The point furthest from (0, 0) is: " + pointList.get(furthestIndex));

        // Create Shape objects with myp1 and myp2 as centers     
        Shape mys1 = new Shape(myp1, "Red");
        Shape mys2 = new Shape(myp2, "Blue");

        // Print out both Shape objects
        System.out.println("Shape 1: " + mys1.toString());
        System.out.println("Shape 2: " + mys2.toString());

        // Print out the distance result
        double distanceShapes = mys1.distanceBetweenCenters(mys2);
        System.out.printf("Distance between Shape 1 and Shape 2: %.2f%n ", distanceShapes);
            }
    
	
	// create and return a list of CS252Point objects
    private static ArrayList<CS252Point> createPointList(int count) {
        ArrayList<CS252Point> retlist = new ArrayList<>();
        int min = -30, max = 40;

        // create points in specified range
        for (int i = 0; i < count; i++) {
            int x = ThreadLocalRandom.current().nextInt(min, max + 1);
            int y = ThreadLocalRandom.current().nextInt(min, max + 1);
            retlist.add(new CS252Point(x, y));
        }
        return retlist;
    }
	
    
    // return the index of the CS252Point element in the list that's 
    // furthest from the origin (0, 0)
    public static int findFurthestFromOrigin(ArrayList<CS252Point> alist) {
        CS252Point furthestPoint = alist.get(0);
        double maxDistance = furthestPoint.distanceBetween(new CS252Point(0, 0));
        int maxIndex = 0;

        for (int i = 1; i < alist.size(); i++) {
            CS252Point currentPoint = alist.get(i);
            double currentDistance = currentPoint.distanceBetween(new CS252Point(0, 0));

            if (currentDistance > maxDistance) {
                maxDistance = currentDistance;
                furthestPoint = currentPoint;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}




/* a. What did you learn from the assignment?
 * From this assignment I learned a lot and I started to understand a bit better the classes and objects, the constructors and mutators
 * b. What did you find easy?
 * Honestly, this assignment was not easy. It was the first time I did something like this and it took me a while to complete the assignment
 * c. What did you find difficult?
 * I think the hardest part was building the method for finding the farthest point from the center 
 * d. What suggestions, if any, do you have for improving this assignment
 * I think this assignment was very complete, we worked with classes, objects, ArraysList... I think it's a very interesting assignment and I definitely learned a lot from it.
*/


