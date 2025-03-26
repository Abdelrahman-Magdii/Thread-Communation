public class Main {
    public static void main(String[] args) {

        ShareResources share = new ShareResources();

        Thread threadProductoe =new Thread(new producer(share));
        Thread threadConsume =new Thread(new consumer(share));

        threadProductoe.start();
        threadConsume.start();

    }
}