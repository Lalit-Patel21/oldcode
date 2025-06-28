
package multithreading.demo;


public class TestMain {
    
    public static void main(String [] args){
	Thread th=Thread.currentThread();
	System.out.println("Thread details:"+th);
	th.setName("Sachin");
	System.out.println("After name change:"+th);
	try{
		for(int i=1;i<=5;i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
			
	}catch(InterruptedException ex){
		System.out.println(th.getName()+" interrupted");
	}
	System.out.println(th.getName()+" finished");
   }
}
    

