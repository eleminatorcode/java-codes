import java.util.Scanner;

import static java.lang.Math.pow;

public class palidrome {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  number to check palidrome:");
        int a= sc.nextInt();
        int sum=0;
        int digit=a;
        int rem;
        while(digit!=0){
            rem=digit%10;
            sum = rem+(sum*10);
            digit=digit/10;
        }

        if(a==sum){

            System.out.println("is palidrome");
        }
        else{
            System.out.println("Not palidrome");
        }

    }
}
