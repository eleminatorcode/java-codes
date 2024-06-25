public class ThreadUsingImplements {
    static class ThreadEx1 implements Runnable{
         public void run(){
             System.out.println("THIS  IS RUNNING");
         }

    }

    public static void main(String[] args) {
         ThreadEx1 t1=new ThreadEx1();
         Thread t2= new Thread(t1);
         t2.start();

    }
}
