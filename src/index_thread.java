public class index_thread {
    public static void main(String[] args){
        myrunnable r=new myrunnable();
        Thread t=new Thread(r);

        t.start();
    }
}
