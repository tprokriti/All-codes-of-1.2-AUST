package spring2018encapsulation;

import java.util.Scanner;

public class Employees extends Employee {

    public Employees(String name, String designation, int eid, int age) {
        super(name, designation, eid, age);

    }

    Employee[] e = new Employee[5];
  
    public void find(String n) {
   int flag = 0;
        for (int i = 0; i < 1; i++) {

            if (n.equals(e[i].getName())) {

                System.out.println("name" + e[i].getName());
                System.out.println("name" + e[i].getDesignation());
                System.out.println("name" + e[i].getEid());
                System.out.println("name" + e[i].getAge());
        flag =1;
            }
        }
      if(flag ==0)
      {
          System.out.println("Employee not found");
      }
    }

    public void Employeeinput() {
        
        String name;
        String designation;
        int eid;
        int age;
        int flag =0;
        for (int i = 0; i < 1; i++) {
            System.out.println("Input Employer's Name");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            System.out.println("Input Employer's Designation ");
            designation = sc.nextLine();
            System.out.println("Input Employer's Eid");
            eid = sc.nextInt();
            System.out.println("Input Employer's Age");
            age = sc.nextInt();
            e[i] = new Employee(name, designation, eid,age);
            flag = 1;
        }
       if(flag==0)
       {
           System.out.println("Employee not found");
       }
    }

    public void find(String b, int c) {
        int flag = 0;
        for (int i = 0; i < 1; i++) {

            if (b.equals(e[i].getDesignation()) && c == e[i].getAge()) {
                System.out.println("name" + e[i].getName());
                System.out.println("name" + e[i].getDesignation());
                System.out.println("name" + e[i].getEid());
                System.out.println("name" + e[i].getAge());
            flag=1;
            }
            
        }
        if(flag==0)
       {
           System.out.println("Employee not found");
       }
    }

    public void find(int a) {
   int flag=0;
        for (int i = 0; i < 1; i++) {

            if (a == e[i].getEid()) {
                System.out.println("name" + e[i].getName());
                System.out.println("name" + e[i].getDesignation());
                System.out.println("name" + e[i].getEid());
                System.out.println("name" + e[i].getAge());
      flag=1;
            }
            
        }
        if(flag==0)
       {
           System.out.println("Employee not found");
       }
    }
}
