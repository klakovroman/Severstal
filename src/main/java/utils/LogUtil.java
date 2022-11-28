package utils;
import org.apache.log4j.Logger;

public class LogUtil {
    static Logger log = Logger.getLogger (LogUtil.class);
   public static Logger getLog () {
       return log;
   }
}