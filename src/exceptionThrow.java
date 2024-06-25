import java.util.Scanner;
public class exceptionThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");

        int age = sc.nextInt();
        if (age > 100) {
            try {
                throw new MyException();

            } catch (Exception e) {
                System.out.println("NOT VALID!");
            }

        }
    }
    static class MyException extends Exception{

    }
}
