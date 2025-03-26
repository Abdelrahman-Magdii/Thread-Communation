public class consumer implements Runnable {

    private ShareResources resources;
    public consumer(ShareResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {

        for (int i = 1; i <=10; i++) {
            try {
                int data=resources.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
