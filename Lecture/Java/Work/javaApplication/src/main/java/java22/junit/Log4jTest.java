package java22.junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest {

    private static Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.info("hello");

        if (logger.isDebugEnabled()) {
            logger.info("hello~!");
        }
    }

}
