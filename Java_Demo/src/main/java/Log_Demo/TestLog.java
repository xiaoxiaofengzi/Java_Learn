package Log_Demo;

/**
 * Created by Xinfeng on 2016/7/8.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestLog {
    public static Log log = LogFactory.getLog(TestLog.class);

    public static void main(String[] args) {
        if (log.isDebugEnabled()) {
//            log.debug(sql);
            String name = "Xinfeng";
            int age = 18;
            log.debug("My name is " + name + "， I am " + age + " years old.");
        }
    }
}
