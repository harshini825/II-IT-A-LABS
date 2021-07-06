class A
{
	int num;
	boolean value = false;
	synchronized int get()
	{
	   if(!value){
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}
            }
	    System.out.println("Got:"+num);
	    value=false;
            try{
               Thread.sleep(1500);
	    } 
	    catch (InterruptedException e)
	    {
	        System.out.println("InterruptedException caught");
	    }
	    notify();
	    return num;
	}
	synchronized void put(int num)
	{
		if(value)
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}
		this.num=num;
		value=true;
		System.out.println("Put:"+num);
                try 
	        {
	            Thread.sleep(1500);
	        }
	        catch (InterruptedException e)
	        {
	                 System.out.println("InterruptedException caught");
	        } 
		notify();
	}
}
class Producer implements Runnable
{
	A a;
	Producer(A a)
	{
		this.a=a;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			a.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	A a;
	Consumer(A a)
	{
		this.a=a;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		{
			a.get();
		}
	}
}
class ProducerConsumer
{
	public static void main(String[] args)
	{
		A a=new A();
		new Producer(a);
		new Consumer(a);
		
         }
}