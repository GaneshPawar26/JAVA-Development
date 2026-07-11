//course by telesk
//started from static keyword  started on 27 march 2026



class One
{

    static class A
    {
        static int age=10;
    }

    public static void main(String args[])
    {
        System.out.println("hii");

        A a1=new A();
        System.out.println(a1.age);

        a1.age++;

        A a2=new A();
        System.out.println(a2.age);
    }
}