
package multithreading.demo;
    
class MyThread2 implements Runnable
{
    
    public void run()
    {
         try
          {
                  for(int i=1;i<=10;i+=2)
                  {
                     System.out.println("child:"+i);
		     Thread.sleep(500);
                  }
          }
          catch(InterruptedException ex)
          {
             System.out.println("child interrupted");
          }
        System.out.println("child finished");
    }
         

}
class UseMyThread2
{
     public static void main(String [] args)
     {
       MyThread2 m1=new MyThread2();
       Thread th=new Thread(m1);
       th.start();
       try
          {
                  for(int i=2;i<=10;i+=2)
                  {
                     System.out.println("main:"+i);
		     Thread.sleep(1000);
                  }
          }
          catch(InterruptedException ex)
          {
             System.out.println("main:interrupted");
          }
        System.out.println("main finished");
     }
}
