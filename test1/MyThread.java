package test1;

public class MyThread implements Runnable
{
    static int ticket = 0;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (MyThread.class)
            {
                if (ticket == 100)
                {
                    break;
                }
                else
                {
                    try
                    {
                        Thread.sleep(100);
                        ticket++;
                        System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
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
