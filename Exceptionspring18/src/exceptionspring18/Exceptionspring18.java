

package exceptionspring18;


public class Exceptionspring18 {

  
    public static void main(String[] args) {
     
        
        Patient p1 = new Patient("Tabia","Dhaka","B+",100, 130,12);
        Patient p2 = new Patient("Tabia","Dhaka","OB+",200, 120,6);
        
        try{
            p1.PatientageCheck();
            p1.PatientsbpCheck();
            p1.PatientdbpCheck();
            p1.PatientbgCheck();
        }catch(PatientException e)
        {
            System.out.println(e);
        }
        try{
            p2.PatientageCheck();
            p2.PatientsbpCheck();
            p2.PatientdbpCheck();
            p2.PatientbgCheck();
        }catch(PatientException e)
        {
            System.out.println(e);
        }
    }
    
}
