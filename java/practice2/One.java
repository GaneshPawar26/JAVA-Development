//exception 

class One
{
    public static void main(String args[])
    {
        int a[]={1,3,62,4,8,9};

        for(int aa : a)
        {
            System.out.print(" "+aa);
        }
    



        int i=0;
        try
        {
            System.out.println("Hii ganesh");

            int j=18/i;

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}