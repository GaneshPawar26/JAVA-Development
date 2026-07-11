enum Days
{
    Sun, Mon, Tues;
}

class Two
{
    public static void main(String args[])
    {
        Days d=Days.Tues;

        System.out.println(d);

        for(Days day: Days.values())
        {
            System.out.println(day);
        }
    }
}