
package circle;

public class Demo {

   
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setRadius(5.2);
        c2.setRadius(3.5);
        
        System.out.println("Area of a circle:"+Math.PI*c1.getRadius()*c2.getRadius());
        System.out.println("Rahim Account balance is :");
       
        if(c1.getRadius() > c2.getRadius())
            System.out.println("First cirle is larger");
        else
            System.out.println("Second circle is larger");
    }
    
}
