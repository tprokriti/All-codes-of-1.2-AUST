

package dellasus;

import java.util.Scanner;


public class Computer {
 private int a, b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
 
    public void input(){
        
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
    }
    
    public void process(int d,int e){
        c = d + e;
    }
    
    public void display(int f){
        System.out.println("The sum of two integers is "+f);
    }
}
