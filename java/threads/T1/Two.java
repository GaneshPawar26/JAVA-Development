class A extends Thread
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

class B extends Thread
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


class Two
{
    public static void main(String args[])
    {
        A a1=new A();
        B b1=new B();

        a1.start();
        b1.start();
    }
}