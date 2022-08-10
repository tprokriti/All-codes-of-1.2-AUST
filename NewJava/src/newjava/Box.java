package newjava;

public class Box {

    double length, width, height;

    public Box(double l, double w, double h) {

        length = l;
        width = w;
        height = h;
    }

    public double getVolume() {
        double a;
        a = height * length * width;
        return a;
    }

    
}
