public class sleep_thread {
    public static void main(String[] args)throws InterruptedException{
        sleep_hi h1=new sleep_hi();
        sleep_hello h2=new sleep_hello();
        h1.start();
        h1.join();
        h2.start();
    }
}
