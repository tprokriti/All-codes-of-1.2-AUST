

package exceptionfall18;

import java.util.Scanner;


public class ExceptionFall18 {

  
    public static void main(String[] args) {
        System.out.println("Do you have a bank account?\n1.Yes\n2.No");
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();
        
        int num=0;
        if(i==1)
        {
          System.out.println("Input your bank account number: ");
        num = sc.nextInt();  
        }
            
        try{
        AtmMachine.atmwithdraw(i,num);
        }catch(WithdrawException e){
            System.out.println(e);
        }
        
    }
    }


