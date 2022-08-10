

package exceptionspring18;


public class Patient {

    private String name;
    private String address;
    private String bloodgroup;
    private double systolicBloodPressure;
    private double diastolicBloodPressure;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getDiastolicBloodPressure() {
        return diastolicBloodPressure;
    }

    public void setDiastolicBloodPressure(double diastolicBloodPressure) {
        this.diastolicBloodPressure = diastolicBloodPressure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient(String name, String address, String bloodgroup, double systolicBloodPressure, double diastolicBloodPressure, int age) {
        this.name = name;
        this.address = address;
        this.bloodgroup = bloodgroup;
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
        this.age = age;
    }
    public void PatientageCheck() throws PatientException{
        if(this.age<5)
        {
           throw new PatientException("Age is not valid"); 
        }
        else
        {
            System.out.println("Age is valid");
        }
    }
        public void PatientsbpCheck() throws PatientException{
            
        if(this.systolicBloodPressure<=40 || this.systolicBloodPressure>=250)
        {
            throw new PatientException("systolicBloodPressure is out of range");
        }
        else
        {
            System.out.println("systolicBloodPressure is in range");
        }
        }
        public void PatientdbpCheck() throws PatientException{
        if(this.diastolicBloodPressure<=30 || this.diastolicBloodPressure>=140)
        {
            throw new PatientException("diastolicBloodPressure is out of range");
        }
         else
        {
            System.out.println("diastolicBloodPressure is in range");
        }
        }
        public void PatientbgCheck() throws PatientException{
        if("A+".equals(this.bloodgroup) || "B+".equals(this.bloodgroup) ||"O+".equals(this.bloodgroup) ||"A-".equals(this.bloodgroup) ||"O-".equals(this.bloodgroup) ||"B-".equals(this.bloodgroup) ||"AB-".equals(this.bloodgroup)||"AB+".equals(this.bloodgroup) )
        {
            System.out.println("Your blood group is right");
        }
        else
        {
            throw new PatientException("Your blood group is not right");
        }
    }
}
