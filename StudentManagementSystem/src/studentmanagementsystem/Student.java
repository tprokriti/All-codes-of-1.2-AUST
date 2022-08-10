package studentmanagementsystem;

public class Student {

    private String firstname;
    private String lastname;
    private String email;
    private int age;
    private String mobilenumber;

    public Student(String firstname, String lastname, String email, int age, String mobilenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.mobilenumber = mobilenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public static void checkName(String name) throws NameException {
        if (name.contains(" ")) {
            throw new NameException("Name should not contain space");
        } else {
            System.out.println("Name is valid");
        }

    }

    public static void checkMail(String mail) throws MailException {
        if (!mail.endsWith("@gmail.com")) {
            throw new MailException("Mail should ends with @gmail.com");
        } else {
            System.out.println("Mail is valid");
        }
    }

    public static void checknumber(String number) throws NumberException {
        if (!number.startsWith("+8801")) {
            throw new NumberException("Number ssw +8801");
        } else {
            System.out.println("Right Number");
        }
    }
}
