

package employeedemo;


public class EmployeeDemo {

  
    public static void main(String[] args) {
     
        Employee rahim = new Employee("Abdur Rahim","Dhaka,Bangladesh",31,55000);
        double eidBonus = rahim.getSalary()*0.15;
        System.out.println(rahim.getName()+" get "+eidBonus+ " EID Bonus ");
    }

}
