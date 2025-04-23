public class CS252Point {
	
	private int x;
	private int y;
	
	// constructors
	public CS252Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public CS252Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	//getters
	public int getX() {
		return x ;
	}
	
	public int getY() {
		return y;
	}
	
	// setters
	public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
    	this.y = y;
    }

    // method to calculate distance
    public double distanceBetween(CS252Point other) {
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString method
    public String toString() {
        return "(x=" + x + ",y=" + y + ")";
    }
    
	
}


