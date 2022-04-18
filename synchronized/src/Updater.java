public class Updater {

    public static void main(String[] args) {
        MyClass o1 = new MyClass();

        Thread t1 = new Thread(new Worker(o1));
        Thread t2 = new Thread(new Worker(o1));
        Thread t3 = new Thread(new Worker(o1));
        Thread t4 = new Thread(new Worker(o1));
        Thread t5 = new Thread(new Worker(o1));
        Thread t6 = new Thread(new Worker(o1));

        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        } catch (InterruptedException e){}

        int value = o1.get();
        long finish = System.currentTimeMillis();

        long timeTaken =  finish - start;

        System.out.println("Value: " + value + " Time taken: " + timeTaken + " ms");

    }
}
