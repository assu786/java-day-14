import java.util.*;
class a extends Thread
{
    public void r()
    {
        System.out.println("i'm thread");
    }
}
class Main
{
    public static void main(String args[])
    {
        a g=new a();
        g.r();
        g.start();
    }
}