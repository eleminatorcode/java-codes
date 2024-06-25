public class exceptionThrows {

    public static void main(String[] args) {
        int a[]=new int[5];
        try {
            getTheIndex(a);
        } catch (Exception e)
        {
            System.out.println("Error in this");
        }

    }
    static int getTheIndex (int a[]) throws ArithmeticException{
        return a[3];
    }
}

