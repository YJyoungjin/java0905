package chp07.lab3;

public class Cylinder {
    int radius;
    int height;

    double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double reactangleArea =2 * Math.PI * radius * height;

        return 2 * circleArea + reactangleArea;
    }
}
