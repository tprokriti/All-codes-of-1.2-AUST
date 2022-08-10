

package dellasus;


public class DellAsus {

  
    public static void main(String[] args) {
     Dell d1 = new Dell();
        System.out.println("Input two integers : ");
        d1.input();
        d1.process(d1.getA(),d1.getB());
        d1.display(d1.getC());
     Asus s1 = new Asus();
        s1.input();
        s1.process(s1.getA(),s1.getB());
        s1.display(s1.getC());
    }

}
