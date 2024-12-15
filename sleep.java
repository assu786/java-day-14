class Main
{
    public static void main(String args[])
    {
        System.out.println("thread started.....");
    try
    {
        Thread.sleep(5000);
    }
    catch(InterruptedException e)
    {
        System.out.println("interrupted");
    }
    System.out.println("Thread resumed");
    }
}