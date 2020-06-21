import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test6")
public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @SneakyThrows
            @Override
            public void run() {
                log.debug("waitting for 2 seconds...");
                Thread.sleep(2000);
            }
        };

        t1.start();
        log.debug("t1 state: {}", t1.getState());

        Thread.sleep(500);

        log.debug("t1 state: {}", t1.getState());

    }
}
