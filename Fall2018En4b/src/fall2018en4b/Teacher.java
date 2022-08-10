package fall2018en4b;

public class Teacher {

    private String name;
    private String designation;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Teacher(String name, String designation, String department) {
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

}
