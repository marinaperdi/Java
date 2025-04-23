public class Shape {
	private CS252Point center;
    private String color;
    
    public Shape() {
        this.center = new CS252Point();
        this.color = "";
    }
    
    public Shape(CS252Point center, String color) {
        this.center = center;
        this.color = color;
    }
    
    public double distanceBetweenCenters(Shape other) {
        return this.center.distanceBetween(other.center);
    }
    
    public String toString() {
        return "Center: (" + center.getX() + ", " + center.getY() + "); Color: " + color;
    }

}
    
    


