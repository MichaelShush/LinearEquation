public class LinearEquation {
    int x1;
    int x2;
    int y1;
    int y2;

    public void LinearEquation(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        double slope = calculateSlope(x1, x2, y1, y2);
        double intercept = calculateIntercept(slope, x1, y1);
        double distance = calculateDistance(x1, x2, y1, y2);

        String formula = ("y = " + slope + "x + (" + intercept + ")");
    }

    public void LineInfo(){
        System.out.println("The points are: (" + x1 + ", " + y1 + "), " + "(" + x2 + ", " + y2 + ").");
        System.out.println("The y-intercept is " + calculateIntercept(x1, x2, y1, y2) + ".");
    }

    public double calculateSlope(int x1, int x2, int y1, int y2){
        return (double)(y2-y1)/(x2-x1);
    }

    public double calculateIntercept(double slope, int x1, int y1){
        return y1 - (x1 * slope);
    }

    public double calculateDistance(int x1, int x2, int y1, int y2){
        return Math.abs(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}