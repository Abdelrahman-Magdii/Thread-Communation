public class ShareResources {

    private int data;
    private boolean hasData;

    public synchronized void producer(int value) throws InterruptedException {
        while(hasData){
            wait();
        }
        data = value;
        hasData = true;
        System.out.println("Producer " + value);
        notify();
    }

    public synchronized int consumer() throws InterruptedException {
        while(!hasData){
            wait();
        }
        hasData = false;
        System.out.println("Consumer " + data);
        notify();
        return data;
    }
}
