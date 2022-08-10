package maximumdigit;

import java.util.Scanner;

public class MaximumDigit {

    public static void main(String[] args) {
        int b=0;
        System.out.println("Enter the digits");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a != 0) {

            if (b < (a % 10)) {
                b = a % 10;
            }
            a = a / 10;
        }
        System.out.println("The maximum value is :" + b);
    }

}
