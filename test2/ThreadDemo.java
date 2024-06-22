package test2;

/**
 * @author wxz
 * @date 17:01 2024/6/21
 */
public class ThreadDemo
{
    public static void main(String[] args)
    {
        MyThread mr = new MyThread();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
