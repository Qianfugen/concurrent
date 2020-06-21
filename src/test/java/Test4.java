import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test4")
public class Test4 {
    public static void main(String[] args) {
        Thread t1=new Thread("t1"){
            @SneakyThrows
            @Override
            public void run() {
                log.debug("running");
                Thread.sleep(2000);
            }
        };
        t1.start();
        log.debug("do other things");
    }
}
