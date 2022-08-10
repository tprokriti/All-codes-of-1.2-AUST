

package fall2020;


public class Student {
 private String id;
 private String name;
 private String department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    
    public  void print(){
        System.out.println("Name :"+this.name);
        System.out.println("Id is :"+this.id);
        System.out.println("Department :"+this.department);
    }
}