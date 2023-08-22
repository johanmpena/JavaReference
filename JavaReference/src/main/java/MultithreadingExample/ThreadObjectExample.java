package MultithreadingExample;

public class ThreadObjectExample extends Thread{
    public void run(){
        try{
            /* DISPLAYING THE THREAD THAT IS RUNNING
             * --------------------------------------- */
            System.out.println("Thread " + Thread.currentThread().getId()
                    + " is running.");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}