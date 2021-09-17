public class CancelThread implements Runnable{

    private Thread self;
    private static int threadCounter;
    private int threadID;
    private int counter;


    public CancelThread(){
        threadID = threadCounter++;
        self = new Thread(this, "CancelThread-" + threadID);
    //    self.start();
    }

    public int start(){
        self.start();
        return counter;
    }

    public int stop(){
        //....
        return counter;
    }


    public int interrupt(){
        System.out.println("Sending interrupt!");
        self.interrupt();
        return counter;
    }

    public int join(int ms) throws InterruptedException{
        self.join(ms);
        return counter;
    }


    @Override
    public void run() {
        while (true){
            counter++;
        }
    }
}
