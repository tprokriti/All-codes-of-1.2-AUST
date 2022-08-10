package govoffice;

public class info {

    private String name;
    private String gender;
    private String occupation;
    private int age;
    private int ID;

    public info(String name, String gender, String occupation, int age, int ID) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void information(){
        System.out.println("Name :"+this.name);
        System.out.println("Gender :"+this.gender);
        System.out.println("Occupation :"+this.occupation);
        System.out.println("Age :"+this.age);
        System.out.println("Id :"+this.ID);
    
}
}
