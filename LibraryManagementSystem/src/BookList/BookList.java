package BookList;

import java.util.Scanner;

public class BookList {

    public static void main(String[] args) {

        String user;
        String department;
        int password;
        int id, year, semester;

        System.out.println("L O G I N");
        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter your name : ");
        user = s3.nextLine();
        System.out.print("Enter your department : ");
        department = s3.nextLine();
        System.out.print("Enter your password(It should be digits) : ");
        password = s3.nextInt();
        System.out.print("Enter your id : ");
        id = s3.nextInt();
        System.out.print("Enter your year : ");
        year = s3.nextInt();
        System.out.print("Enter your semester : ");
        semester = s3.nextInt();

        UserInfo y = new UserInfo(user, password, user, department, id, year, semester);
        System.out.println("");
        System.out.println("U S E R  I N F O:");
        System.out.println("Student Name : " + y.getName());
        System.out.println("Department : " + y.getDepartment());
        System.out.println("Student ID : " + y.getId());
        System.out.println("Year : " + y.getYear());
        System.out.println("Semester : " + y.getSemester());
        System.out.println(" ");

        Department m = new List();
        if (department.contains("CSE") || department.contains("cse") || department.contains("Cse")) {
            m.CSE("CSE");
        }
        if (department.contains("EEE") || department.contains("eee") || department.contains("Eee")) {
            m.EEE("EEE");
        }
        if (department.contains("ME") || department.contains("me") || department.contains("Me")) {
            m.ME("ME");
        }
        if (department.contains("TEXTILE") || department.contains("textile") || department.contains("Textile")) {
            m.TEXTILE("TEXTILE");
        }
        if (department.contains("ARCHITECTURE") || department.contains("architecture") || department.contains("Architecture")) {
            m.ARCHITECTURE("ARCHITECTURE");
        }
        if (department.contains("CIVIL") || department.contains("civil") || department.contains("Civil")) {
            m.CIVIL("CIVIL");
        }
    }
}
