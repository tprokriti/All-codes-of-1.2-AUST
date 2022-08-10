

package exception;


public class Excep11 {

  
    public static void main(String[] args) {
     
        try{
            int a = 5;
            int b = 0;
            int c=a/b;
            
            int m[] = {1,2,3,4};
            System.out.println("The last index is "+m[10]);
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException f){
            System.out.println(f);
        }catch(Exception g){
            System.out.println(g);
        }
            
     
    }

}
