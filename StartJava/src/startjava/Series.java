package startjava;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter the last number:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum = sum + i;

        }
        System.out.println();
        System.out.println("The sum is:" +sum);
    }
}
