package fall2018en4b;

import java.util.Scanner;

public class Searching {

    Teacher[] tname = new Teacher[1];

    Student[] sname = new Student[1];
    int flag = 0;

    public void doSearch(String name) {
        for (int i = 0; i < 1; i++) {
            if (name.equals(tname[i].getName())) {
                System.out.println("Teacher Found\nName " + tname[i].getName());
                System.out.println("Designation " + tname[i].getDesignation());
                System.out.println("Department " + tname[i].getDepartment());
                flag = 1;
            }

        }
        if (flag == 0) {
            System.out.println("Teacher not found");
        }
        for (int i = 0; i < 1; i++) {
            if (name.equals(sname[i].getName())) {
                System.out.println("Student Found\nName " + sname[i].getName());
                System.out.println("Id " + sname[i].getId());
                System.out.println("Department " + sname[i].getDepartment());
                flag = 1;
            }

        }
        if (flag == 0) {
            System.out.println("Student not found");
        }

    }

    public void Teacherinput() {
        String Name;
        String Designation;
        String Department;

        for (int i = 0; i < 1; i++) {
            System.out.println("Input Teacher Name");
            Scanner sc = new Scanner(System.in);
            Name = sc.nextLine();
            System.out.println("Input Teacher Designation ");
            Designation = sc.nextLine();
            System.out.println("Input Teacher Department");
            Department = sc.nextLine();
            tname[i] = new Teacher(Name, Designation, Department);
        }

    }

    public void Studentinput() {
        String Name;
        String Department;
        int Id;

        for (int i = 0; i < 1; i++) {
            System.out.println("Input Student Name");
            Scanner sc = new Scanner(System.in);
            Name = sc.nextLine();
            System.out.println("Input Student Id");
            Id = sc.nextInt();
            System.out.println("Input Student Department");
            Department = sc.nextLine();

            sname[i] = new Student(Name, Id, Department);
        }

    }
}
