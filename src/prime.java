import java.util.Scanner;
public class prime {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n=sc.nextInt();
        System.out.println("Enter the number m:");
        int m=sc.nextInt();
        int i,j;
        int check=0;
        for( i=n;i<m;i++){
            for( j=2;j<i;j++){
                if(i%j==0) {
                    check=0;
                    break;

                }
                else {
                    check++;
                }
            }
            if(check!=0){
                System.out.println(i);
            }
        }

    }
}
