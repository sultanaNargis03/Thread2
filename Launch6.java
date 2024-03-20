import java.util.Scanner;

class Alien implements Runnable
{
	
	@Override
	public void run() 
	{
		String tName=Thread.currentThread().getName();
		//System.out.println(Thread.currentThread().getPriority());
		if(tName.equals("CALC"))
		{
			calc();
		}
		else
		{
			message();
		}
		
	}
	public void calc()
	{

		System.out.println("Calculation task started..");
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the first numer");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the second numnber");
		int num2=scan.nextInt();
		
		int res=num1+num2;
		System.out.println(res);
		System.out.println("Calculation task is completed");
	}
	public void message()
	{
		System.out.println("Displaying important message started");
		
		for(int i=0;i<4; i++)
		{
			System.out.println("Focus is importamt to master the skills");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Displaying important message ended");
		
		
	}

}


public class Launch6 
{

	public static void main(String[] args) 
	{
		Alien al=new Alien();
		
		Thread t1=new Thread(al);
		Thread t2=new Thread(al);
		
		t1.setName("CALC");
		t2.setName("MSG");
		
		t1.start();
		t2.start();

	}

}
