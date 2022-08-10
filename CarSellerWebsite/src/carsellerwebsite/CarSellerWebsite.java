package carsellerwebsite;

import java.util.Scanner;

public class CarSellerWebsite {

    public static void main(String[] args) {

        System.out.println("Enter the width of the Picture:");
        Scanner Sc1 = new Scanner(System.in);
        int width = Sc1.nextInt();

        System.out.println("Enter the height of the Picture:");
        int height = Sc1.nextInt();

        System.out.println("Enter Car made Year:");
        int year = Sc1.nextInt();

        AboutCar nam = new AboutCar(height, width, year);
        try {
            nam.checkPicture();

        } catch (CarPictureException e) {
            System.out.println(e);
        }
        try {
            nam.checkMade();
        } catch (CarMadeException c) {
            System.out.println(c);
        }
    }

}
