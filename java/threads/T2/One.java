

class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hii");

            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
    
}

class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hello");

             try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
    
}

class One
{
    public static void main(String args[])
    {
        Runnable a1=new A();
        Runnable b1=new B();

        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);
        t1.start();
        t2.start();
    }
}