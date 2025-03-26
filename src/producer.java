public class producer implements Runnable {

    private ShareResources resources;
    public producer(ShareResources resources) {
        this.resources = resources;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                resources.producer(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
