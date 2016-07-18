package Log_Demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLoggingTest {
    public static void main(String args[]) {
              // 程序的其它处理
              //使用Logger的静态方法获得一个匿名          //Logger
              Logger logger1 = Logger.getAnonymousLogger();
              // 记录消息
              logger1.log(Level.INFO,"第一条日志记录");
              //程序 的其它处理
          }
}