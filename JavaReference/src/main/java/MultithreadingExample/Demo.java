package MultithreadingExample;

public class Demo {
    public static void main(String[] args) {
        /* USING MULTITHREADING BY IMPLEMENTING RUNNABLE INTERFACE.
         * ------------------------------------------------------------------ */
        MultithreadingExample.RunnableInterfaceExample[] arrayOfInstances = {new MultithreadingExample.RunnableInterfaceExample(),
                new MultithreadingExample.RunnableInterfaceExample(),
                new MultithreadingExample.RunnableInterfaceExample()};

        for(int i = 0; i < 3; i++){
            Thread object =
                    new Thread(arrayOfInstances[i]);
            object.start();
        }

        /* USING MULTITHREADING BY EXTENDING THREAD CLASS.
         * ----------------------------------------------------------------- */
        MultithreadingExample.ThreadObjectExample threadExample1 = new MultithreadingExample.ThreadObjectExample();
        MultithreadingExample.ThreadObjectExample threadExample2 = new MultithreadingExample.ThreadObjectExample();
        MultithreadingExample.ThreadObjectExample threadExample3 = new MultithreadingExample.ThreadObjectExample();

        threadExample1.start();
        threadExample2.start();
        threadExample3.start();
    }
}