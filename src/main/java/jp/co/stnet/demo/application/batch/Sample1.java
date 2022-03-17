package jp.co.stnet.demo.application.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Sample1 implements ApplicationRunner {

    public String getHello() {
        return "hello!";
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info(getHello());

        throw new Exception("Error!");

    }
}
