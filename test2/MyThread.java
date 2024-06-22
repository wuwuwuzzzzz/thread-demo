package test2;

public class MyThread implements Runnable
{
    static int ticket = 100;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (MyThread.class)
            {
                if (ticket <= 10)
                {
                    break;
                }
                else
                {
                    try
                    {
                        Thread.sleep(100);
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "在送第" + ticket + "份礼品");
                    }
                    catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
