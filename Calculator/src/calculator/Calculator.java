

package calculator;

import java.util.Scanner;


public class Calculator {

  
    public static void main(String[] args) {
     BasicCalculator bc = new BasicCalculator();
     ScientificCalculator sc = new ScientificCalculator();
     
     Scanner scc = new Scanner(System.in);
        System.out.println("Input two Numbers");
     int i = scc.nextInt();
     int j = scc.nextInt();
     int k = scc.nextInt();
        System.out.println("Add two digits"+bc.add(i,j));
        System.out.println("Sub two digits"+bc.sub(i,j));
        System.out.println("Multiply two digits"+bc.mul(i,j));
        System.out.println("Division two digits"+bc.div(i,j));
        System.out.println("Sine two digits"+sc.sin(k));
        System.out.println("Cosine two digits"+sc.cos(k));
        System.out.println("Tangent two digits"+sc.tan(k));
     
        
    }

}
