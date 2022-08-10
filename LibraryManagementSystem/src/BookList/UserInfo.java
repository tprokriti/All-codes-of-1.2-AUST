package BookList;

public class UserInfo extends Login{
    
    private String name;
    private String department;
    private int id;
    private int year;
    private int semester;
    
    
    public UserInfo(String user,int pass,String name, String department, int id, int year, int semester){
        super(user, pass);
        this.name = name;
        this.department = department;
        this.id = id;
        this.year = year;
        this. semester = semester;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
}
