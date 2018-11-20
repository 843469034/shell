package Service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2018/11/20.
 */
@RunWith(SpringRunner.class)

@Slf4j
public class LoggerTest
{

    @Test
    public  void test1(){

        log.info("aaa");
    }

}
