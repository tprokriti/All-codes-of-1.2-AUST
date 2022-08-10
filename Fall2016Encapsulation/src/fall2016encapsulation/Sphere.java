

package fall2016encapsulation;


public class Sphere {

    private double baseRadius;

    public double getBaseRadius() {
        return baseRadius;
    }

    public void setBaseRadius(double baseRadius) {
        this.baseRadius = baseRadius;
    }

    public Sphere(double baseRadius) {
        this.baseRadius = baseRadius;
        
        
    }
     public void display(){
         
            System.out.println("The BaseRadius is :"+this.baseRadius);
            
        }
     
}
    
    

