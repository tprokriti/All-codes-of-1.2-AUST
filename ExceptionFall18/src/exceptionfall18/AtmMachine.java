package exceptionfall18;

public class AtmMachine {


    public static void atmwithdraw(int a, int number) throws WithdrawException{
        if(a==1)
        {
            System.out.println("Money withdrawn :"+number);
        }
        if(a==2)
        {
           throw new WithdrawException("you don't have any bank account here");
        }
    }
}
