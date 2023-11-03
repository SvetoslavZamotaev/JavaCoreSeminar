public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RoundTable());
        thread.start();
    }
}