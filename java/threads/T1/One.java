//Every thread class must have run method 
//here every object of that class becomes a new thread


class A extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hii");
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
        }
    }
}

class One
{
    public static void main(String []args)
    {
        A a1=new A();
        B b1=new B();

        a1.start();
        b1.start();
    }
}