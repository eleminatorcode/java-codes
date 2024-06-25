public class Throw1 {
    static class example implements Runnable{
       public void run(){
            System.out.println("Thread is running");
        }

        public static void main(String[] args) {
            example e1=new example();
            Thread thread= new Thread(e1);
            thread.start();
        }
    }
}
