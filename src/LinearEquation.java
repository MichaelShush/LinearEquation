public class LinearEquation {
    int x1;
    int x2;
    int y1;
    int y2;
    double intercept;
    double distance;
    double slope;
    String formula;

    public LinearEquation(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        this.slope = calculateSlope(x1, x2, y1, y2);
        this.intercept = calculateIntercept(slope, x1, y1);
        this.distance = calculateDistance(x1, x2, y1, y2);

        this.formula = ("y = " + slope + "x + (" + intercept + ")");
    }

    public void LineInfo(){
        System.out.println("The points are: (" + x1 + ", " + y1 + "), " + "(" + x2 + ", " + y2 + ").");
        System.out.println("The equation for this line is: " + slope + "x + " + intercept + ".");
        System.out.println("The slope of this line is " + slope + ".");
        System.out.println("The y-intercept for this line is " + intercept + ".");
        System.out.println("The distance between these points is " + distance + ".");
    }

    public double calculateSlope(int x1, int x2, int y1, int y2){
        return (double)(y2-y1)/(x2-x1);
    }

    public double calculateIntercept(double slope, int x1, int y1){
        return y1 - (x1 * slope);
    }

    public double calculateDistance(int x1, int x2, int y1, int y2){
        double length = (Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
        return Math.sqrt(length);
    }

    public double findPoint(double x) {
        return (x * slope) + intercept;
    }
}