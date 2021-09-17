public class JavaApplication20 {

    public static void main(String[] args) throws InterruptedException {
        CancelThread thread = new CancelThread();

        System.out.println("start() = " + thread.start());
        System.out.println("start() = " + thread.join(1000));
        System.out.println("start() = " + thread.interrupt());
    }

}
