public class MyClass {

    private int count;

    public MyClass() {
        count = 0;
    }

    public int get(){
        return count;
    }
    public synchronized void inc(){
        count++;
    }
}

class Worker implements Runnable{

    MyClass obj;

    Worker(MyClass o){
        obj = o;
    }

    @Override
    public void run() {

        for (int i = 0; i<1000; i++){
            obj.inc();
        }


    }
}
