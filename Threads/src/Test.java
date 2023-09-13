class Printer
{
	synchronized public void print(String[] messages)
	{
		for(String m : messages)
			System.out.println(m);
		System.out.println();
	}
}
class ChildThread implements Runnable
{
	Thread t;
	Printer p;
	String[] messages;
	public ChildThread(Printer p,String[] messages)
	{
		t = new Thread(this);
		this.p=p;
		this.messages=messages;
		t.start();
	}
	public void run()
	{
		p.print(messages);
	}
}

public class Test {

	public static void main(String[] args) throws Exception
	{
		Printer p = new Printer(); 
		ChildThread ct1 = new ChildThread(p,new String[] {"hello","banana","welcome"});
		ChildThread ct2 = new ChildThread(p,new String[] {"java","dotnet","python"});
		ChildThread ct3 = new ChildThread(p,new String[] {"rrr","ssr","ntr"});
		try
		{
		  ct1.t.join();
		  ct2.t.join();
		  ct3.t.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Main is terminating");
	}

}


//class ChildThread implements Runnable
//{
//	Thread t;
//	
//	public ChildThread(String name,int priority)
//	{
//		t = new Thread(this,name);
//		this.t.getPriority();
//		t.start();
//	}
//	public void run()
//	{
//		try
//		{
//		for(int i=0;i<=10;i++) 
//		  {
//			System.out.println(t.getName()+" "+i);
//		     t.sleep(1000);
//		  }
//		}
//		catch(InterruptedException ex)
//		{
//			ex.printStackTrace();
//		}
//		System.out.println(t.getName() + "is terminating");
//	}
//}

//class SecondThread implements Runnable
//{
//	Thread t;
//	public SecondThread()
//	{
//		t = new Thread(this);
//		t.start();
//	}
//	public void run()
//	{
//		for(int i=0;i<=20;i++)
//			System.out.println(i);
//	}
//}


//class SecondThread extends Thread
//{
//	public SecondThread()
//	{
//		start();
//	}
//	public void run()
//	{
//		for(int i=0;i<=20;i++)
//			System.out.println(i);
//	}
//}

