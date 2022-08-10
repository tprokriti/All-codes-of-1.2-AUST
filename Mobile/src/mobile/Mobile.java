package mobile;

import java.util.Scanner;

public class Mobile {

    public static void main(String[] args) {

        String message;

        System.out.println("Type your Message");
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();

        System.out.println("The Message");
        SmartMessage.message(message);
        
        System.out.println("The Message is");
        ClassicMobile.message(message);
    }

}
