class Main{
    public static void main(String args[])
    {
        Runnable r=()->System.out.println("im new from java8 version");
        Thread t=new Thread(r);
        t.start();
    }
}