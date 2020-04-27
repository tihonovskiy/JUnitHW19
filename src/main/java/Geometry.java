public class Geometry {
    public int squarArea(int a) {
        return a*a;
    }
    public int squarePerimeter(int a) {
        return a*4;
    }
    public int rectangleArea(int a, int b) {
        return a*b;
    }
    public int rectanglePerimeter(int a, int b) {
        return (a+b)*2;
    }
    public double areaCircle(double r) {
        return Math.PI*r*r;
    }
}
