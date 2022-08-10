package spring2018;

public class Student {

    

    private String name;
    private String faculty;
    private double semesterFee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getSemesterFee() {
        return semesterFee;
    }

    public void setSemesterFee(double semesterFee) {
        this.semesterFee = semesterFee;
    }

    public Student(String name, String faculty, double semesterFee) {
        this.name = name;
        this.faculty = faculty;
        this.semesterFee = semesterFee;

    }

    public void calculateCgpa() {

    }

    public static double calculateSemesterFee(EEE e) {
        
        return 10000 - (10000 * 0.15);

    }

    public static double calculateSemesterFee(CSE c) {
        return 10000 - (10000 * 0.1);
    }

    public double calculateSemesterFee() {
        return 10000 - (10000 * 0.1);
    }
}
