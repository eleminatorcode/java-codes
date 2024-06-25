public class ThreadusingExtend {
    static class ThreadEx extends Thread{
        public void run(){
            int a=10;
            int b=22;
            int result=a+b;
            System.out.println("RESULT="+result);
        }
        
    }

    public static void main(String[] args) {
        ThreadEx t1= new ThreadEx();
        t1.start();
        
    }
}
