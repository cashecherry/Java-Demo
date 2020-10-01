class threading {
    public static void main(String[] args)
    throws InterruptedException {
    System.out.println("Hello world!");
    int n=8;// 8 threads
    for(int i=0;i<n;i++)
    {
    Threadtest t= new Threadtest();
    t.start();// initiate a thread
    t.sleep(5000);
    //t.setPriority(10);
    }
   
    }
   }
class Threadtest extends Thread
{
public void run()
{
System.out.println("ThreadNo."+Thread.currentThread().getId()+
"running");
}
}
