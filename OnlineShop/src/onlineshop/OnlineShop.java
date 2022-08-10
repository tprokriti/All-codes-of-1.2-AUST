

package onlineshop;

public class OnlineShop {

  
    public static void main(String[] args) {
        
     MainException ms = new MainException();
        try {
            ms.input();
        } catch (Location ex) {
            System.out.println(ex);
        } catch (PhoneNumber ex) {
            System.out.println(ex);
        }
    }

}
