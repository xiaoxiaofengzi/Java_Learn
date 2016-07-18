package logtest;

/**
 * Created by Xinfeng on 2016/7/8.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogBySlf4J {
    public static Logger logger = LoggerFactory.getLogger(TestLogBySlf4J.class);

    public static void main(String[] args) {
//        logger.debug(sql);
        String name = "Xinfeng";
        int age = 18;
        logger.info("My name is {}， I am {} years old.", name, age);
        logger.debug("我是logger1，debug");
        logger.info("我是logger1，info");
        logger.warn("我是logger1，warn");
        logger.error("我是logger1，error");
//        logger.fatal("我是logger1，fatal");
    }
}
