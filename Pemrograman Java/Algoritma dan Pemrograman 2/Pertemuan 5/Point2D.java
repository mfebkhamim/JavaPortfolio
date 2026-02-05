public class Point2D{
	public double x; 
	public double y; 
	
	//Ini Constructor
	public Point2D(double x, double y){
		this.x = x;
		this.y = y; 
	}
	
	//Ini beberapa member method
	public Point2D clone(){
		return new Point2D(this.x, this.y);
	}
	
	public String toString(int precision){
		double roundedX = Math.round(this.x * Math.pow(10, precision)) / Math.pow(10, precision);
		double roundedY = Math.round(this.y * Math.pow(10, precision)) / Math.pow(10, precision);
		return"(" + roundedX + ", " + roundedY + ")";
	}
	
	public int quadrant(){ 
	if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            // Terletak pada daerah asal (0,0)
            return 0;
        }
	}

		
	public Point2D translate(double x, double y){
		this.x = this.x + x; 
		this.y = this.y + y; 
		return this; 
	}
	
	public Point2D rotate(double theta){
		double xBaru = this.x * Math.cos(theta) - this.y * Math.sin(theta);
		double yBaru = this.x * Math.sin(theta) + this.y * Math.cos(theta);
		this.x = xBaru;
		this.y = yBaru;
		return this;
	}
	
	public Point2D reflect(double x, double y){
	double theta = Math.atan2(y,x);
		double xBaru = this.x * Math.cos(2*theta) + this.y * Math.sin(2*theta);
		double yBaru = this.x * Math.sin(2*theta) - this.y * Math.cos(2*theta);
		this.x = xBaru;
		this.y = yBaru;
		return this;
	}

	//Ini adalah class method
	static double distance(Point2D a, Point2D b){
		double deltaX = a.x - b.x; 
		double deltaY = a.y - b.y; 
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}
}