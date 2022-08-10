package spring2018encapsulation;

public class Spring2018Encapsulation {

    public static void main(String[] args) {

        Employees ee = new Employees("Tabia", "Senior", 98, 12);
        ee.Employeeinput();
        ee.find("Tabia");
        ee.find("Senior", 12);
        ee.find(98);
        
    }

}
