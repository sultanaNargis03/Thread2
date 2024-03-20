
public class LaunchApp2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Main Thread started");
		
		Thread thread=Thread.currentThread();
		String threadName=thread.getName();
		System.out.println("Name of currently running Thread : "+threadName);
		System.out.println("The priority of the thread is : "+thread.getPriority());
		System.out.println("**************");
		System.out.println();
		thread.setName("Telusko");
		thread.setPriority(6);
		
		System.out.println("Name of currently running Thread after changing : "+thread.getName());
		System.out.println("The priority of the thread after changing is : "+thread.getPriority());
		System.out.println("**************");
		
		
//		System.out.println("Currently the Thread which is running is : "+Thread.currentThread().getName());
		//Thread.sleep(5000);
		
		System.out.println("Main Thread Completed the task");

	}

}
