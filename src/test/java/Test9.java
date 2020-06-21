import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test9")
public class Test9 {
    public static void main(String[] args) {

        Runnable task1 = () -> {
            int count = 1;
            while (true) {
                System.out.println("---->1 " + count++);
            }
        };

        Runnable task2 = () -> {
            int count = 1;
            while (true) {
                //让出时间片
                Thread.yield();
                System.out.println("        ---->2 " + count++);
            }
        };

        Thread t1 = new Thread(task1, "t1");
        Thread t2 = new Thread(task2, "t2");

        //优先级,值越大,优先级越高
//        t1.setPriority(5);
//        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
