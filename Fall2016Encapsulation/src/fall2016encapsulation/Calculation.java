

package fall2016encapsulation;


public class Calculation {

   public static double calcVolume(Sphere a){
       
       return (4*3.1416*a.getBaseRadius()*a.getBaseRadius()*a.getBaseRadius())/3;
       
    }
   public static double calcVolume(Cube b){
       return b.getLength()*b.getWidth()*b.getHeight();
       
       
      
       
   }
}
