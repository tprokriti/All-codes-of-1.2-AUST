package file;

import java.util.Scanner;

public class File {

    public static void main(String[] args) {

        int i;
        System.out.println("Enter 1 for printing pdf file or 2 for printing jpeg file");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        pdf obj1 = new pdf();
        jpeg obj2 = new jpeg();
        printer.print(obj1, obj2, i);
    }

}
