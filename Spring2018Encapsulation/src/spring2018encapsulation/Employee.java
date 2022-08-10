package spring2018encapsulation;

public class Employee {

    private String name;
    private String designation;
    private int eid;
    private int age;

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

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String designation, int eid, int age) {
        this.name = name;
        this.designation = designation;
        this.eid = eid;
        this.age = age;
    }
}
