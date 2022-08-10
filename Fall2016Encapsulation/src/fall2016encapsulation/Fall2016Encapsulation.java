package fall2016encapsulation;

public class Fall2016Encapsulation {

    public static void main(String[] args) {

        Sphere s1 = new Sphere(10);
        s1.display();

        System.out.println("Volume of the Sphere is :" + Calculation.calcVolume(s1));

        Cube c1 = new Cube(5.7, 3.2, 1.2);
        c1.display();
        System.out.println("The Volume of the Cube is :" + Calculation.calcVolume(c1));
    }

}
