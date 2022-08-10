package studentmanagementsystem;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Student("Tabi a", "Morshed", "tabia.m@gmail.com", 12, "+0100000111");
        try {
            System.out.print("First ");
            Student.checkName(s1.getFirstname());
        } catch (NameException e) {
            System.out.println(e);
        }
        try {
            System.out.print("Last ");
            Student.checkName(s1.getLastname());
        } catch (NameException e) {
            System.out.println(e);
        }
        try {
            Student.checkMail(s1.getEmail());
        } catch (MailException e) {
            System.out.println(e);
        }
        try {
            Student.checknumber(s1.getMobilenumber());
        } catch (NumberException e) {
            System.out.println(e);
        }
    }

}
