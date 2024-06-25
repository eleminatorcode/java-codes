import java.util.*;
public class Account {
    void AccountDetail(String name,int ac){
        System.out.println("Account Holder:"+name);
        System.out.println("Account Number:"+ac);
    }
    void Balance(double balance){
        System.out.println("Balance :"+balance);
    }
    void Deposite(double deposite,double bal){
        bal+=deposite;
        System.out.println("Deposited Ammount"+deposite);

    }
     void Debit(double debit,double bal){
        if(bal>=debit){
            bal=bal-debit;
            System.out.println("Balance:"+bal);
        }
        else {
            System.out.println("Not Enough Money");
        }

     }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Account Holder:");
        String name=sc.nextLine();
        System.out.println("Account Number:");
        int accountNumber=sc.nextInt();
        System.out.println("Deposite:");
        double deposite=sc.nextDouble();
        System.out.println("Ammount Debit:");
        double debit=sc.nextDouble();

        double balance=0;
        Account acno=new Account();
        acno.AccountDetail(name,accountNumber);
        acno.Balance(balance);
        acno.Debit(debit,balance);



    }
}

